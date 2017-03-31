package task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckSumNumberIsPalindrome {
	public static Scanner sc;
	public static List<Integer> myList = new ArrayList<Integer>();
	
	public static boolean isSumPalindrome (int input) {
		boolean bool = false;
		int buffInput = input;
		while (input > 0) {
			myList.add(input%10);
			input /= 10;
		}
		StringBuilder strNum = new StringBuilder();

		for (Integer num : myList) {
		     strNum.append(num);
		}
		int finalInt = Integer.parseInt(strNum.toString());
		int sum = buffInput + finalInt;
		
		//System.out.println("Input " + buffInput);
		//System.out.println("strNum " + strNum);
		//System.out.println("sum " + sum);
		
		
		int[] arrayWithDigits = new int[sum];
		int i;
		for (i = 0; sum > 0; i++) {
			arrayWithDigits[i] = sum%10;
			sum /= 10;
		}

		for (int k = 0, j = i - 1; k <= i/2 && j >= i/2 ; k++, j--) {
			if (arrayWithDigits[k] == arrayWithDigits[j]) {
				bool = true;
			} else {
				return false;
			}
		}
		return bool;
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if (number < 0) {
			number = Math.abs(number);
		}
		boolean bool = isSumPalindrome(number);
		if (bool) {
			System.out.print("True");
		} else {
			System.out.print("False");
		}
	}
}
