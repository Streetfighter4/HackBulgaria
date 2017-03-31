package task;

import java.util.Scanner;

public class ReverseТheОddWordsInString {
	public static String[] ReverseWords(String sentence) {
		String[] arraySentence = sentence.split(" ");
		int i = 0;
		for (String wordTemp : arraySentence) {
			if (i%2 == 1) {
				StringBuilder sb = new StringBuilder(wordTemp);
				arraySentence[i] = sb.reverse().toString();
			}
			i++;
		}
		return arraySentence;
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String sentence = sc.nextLine();
		String[] newSentence = ReverseWords(sentence);
		for (String string : newSentence) {
			System.out.print(string + " ");
		}
		sc.close();
	}	
}
