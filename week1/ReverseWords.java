import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class ReverseWords {
	public static String ReverseWords(List<String> sentence) {
		int wordId = -1;
		sentence.Arrays.asList(sentence.split(" "));
		for (String string : sentence) {
			wordId = sentence.indexOf(string);
			if (wordId%2 == 1) {
				string.reverse();
			}
		}
		return sentence;

	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String sentence = sc.nextLine();
		List<String> listSentence = Arrays.asList(sentence);
		String newSentence = ReverseWords(listSentence);
	}	
}