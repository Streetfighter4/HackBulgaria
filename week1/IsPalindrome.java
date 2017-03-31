import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

class IsPalindrome {
	public static boolean IsPalindrome(int number) {
		int[] arrayWithDigits = new int[number];
		boolean isPalindrome = false;
		int i;
		for (i = 0; number > 0; i++) {
			arrayWithDigits[i] = number%10;
			number /= 10;
		}

		for (int k = 0, j = i - 1; k <= i/2 && j >= i/2 ; k++, j--) {
			if (arrayWithDigits[k] == arrayWithDigits[j]) {
				isPalindrome = true;
			} else {
				return false;
			}
		}
		return isPalindrome;
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int i = sc.nextInt();
		boolean bool;

		if (i < 0) {
			i = Math.abs(i);
		}

		bool = IsPalindrome(i);   
		
		if (bool) {
			System.out.print(sc.nextLine() + "IsPalindrome\n");
		} else {
			System.out.print(sc.nextLine() + "NotPalindrome\n");
		}

	}	
}