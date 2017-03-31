package task;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CheckTheNumber {
	private static Scanner sc;
	public static String [] vowelsConsonantsDigits(String sentence) {
		List<Character> vowels = Arrays.asList('a', 'u', 'i', 'o', 'e',
												'A', 'U', 'I', 'O', 'E');
		List<Character> consonant = Arrays.asList('B', 'b', 'C', 'c', 'D', 'd', 'F', 'f',
				'G', 'g', 'H', 'h', 'J', 'j', 'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n',
				'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', 'V', 'v', 'W', 'w',
				'X', 'x', 'Y', 'y', 'Z', 'z');
		List<Character> digits = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7',
				'8', '9');
		Integer vowelsNum = 0;
		Integer consonantNum = 0;
		Integer digitsNum = 0;
		for (Character ch : sentence.toCharArray()) {
			if (vowels.contains(ch)) {
				vowelsNum++;
			} else if (consonant.contains(ch)) {
				consonantNum++;
			} else if (digits.contains(ch)) {
				digitsNum++;
			}
		}
		String vowelsNumS = Integer.toString(vowelsNum);
		String consonantNumS = Integer.toString(consonantNum);
		String digitsNumS = Integer.toString(digitsNum);
		String[] myReturnString = new ArrayString{"[Vowels: ", vowelsNumS,
											"Consonants: ",consonantNumS, 
								"Digits: ", digitsNumS};
		return myReturnString;
	}
	public static void main(String[] args) {
		sc = new Scanner(System.in);
	    String sentence = sc.nextLine();
	    
	    String[] checkNum = vowelsConsonantsDigits(sentence);
	    for (String string : checkNum) {
			System.out.print(string);
		}
	}
}
