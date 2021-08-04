package application;

import java.util.Random;

public class RandomWord {
	private String []words = {"spill","post","agent",
			"accumulation","bounce","dive","peanut","forward",
			"separate","rest","brave","respectable","exploit",
			"general","death"};
	private StringBuilder outputtedWord = new StringBuilder();
	private String word;
	
	public StringBuilder getOutputtedWord() {
		return outputtedWord;
	}

	public void setOutputtedWord(StringBuilder outputtedWord) {
		this.outputtedWord = outputtedWord;
	}

	public RandomWord() {
		Random random = new Random();
		word = words[random.nextInt(15)];
		for(int i = 0; i < word.length();i++) {
			outputtedWord.append("_ ");
		}
	}

	public String[] getWords() {
		return words;
	}

	public void setWords(String[] words) {
		this.words = words;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

}
