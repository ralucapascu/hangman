package application;

import java.util.Scanner;

public class Hangman {
	
	private boolean running = true;
	private RandomWord randomWord = new RandomWord();
	private String word = randomWord.getWord();
	private String userCharacter;
	private Scanner scanner = new Scanner(System.in);
	private StringBuilder outputtedWord = randomWord.getOutputtedWord();
	private int tries = 5;
	private String missingLetter = "_";
	
	public void run() {
		do {
			displayWord();
			getUserInput();
			checkUserInput();
		}while(running);
	}
	
	void displayWord() {
		
		System.out.println();
		System.out.println(outputtedWord);
		System.out.println();
		System.out.println("Tries remaining: " + tries);
		System.out.println();
	}
	
	void getUserInput() {
		System.out.print("Guess a letter: ");
		userCharacter = scanner.next();
		
	}
	
	void checkUserInput() {
		if(word.contains(userCharacter)) {
			for(int i = 0; i < word.length(); i++)
				if(word.charAt(i) == userCharacter.charAt(0)) {
					outputtedWord.setCharAt(2*i, userCharacter.charAt(0));
				}	
			}
		else tries--;
		if(tries==0) {
			System.out.println("You died!");
			running=false;
		}
		if(!outputtedWord.toString().contains(missingLetter)) {
			System.out.println();
			System.out.println(outputtedWord);
		    System.out.println();
			System.out.println("Congrats, you won!");
			running = false;
		}
	}

}
