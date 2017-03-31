import java.util.Scanner;
import java.lang.Math;

class FactorialDigits {
	public static int factorialDigits(int number) {
		int lastDigits = 0;
		int factorialCurrNumber;
		int factorialNumber = 0;

		while (number > 0) {
			factorialCurrNumber = 1;
			lastDigits = number%10;
			number /= 10;
			
			for (int i = 1; i <= lastDigits; i++) {
				factorialCurrNumber *= i;
			}
			factorialNumber += factorialCurrNumber;
		}
		return factorialNumber;
	}

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
	int factorialNumber = 0;

	if (i < 0) {
		i = Math.abs(i);
	}

	factorialNumber = factorialDigits(i);   
	
	System.out.print("\n" + factorialNumber);
	

	}	
}