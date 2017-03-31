package task;

import java.util.Scanner;

public class FindTheSumOfTheDivisors {
	
	private static Scanner sc1;
	private static Scanner sc2;

	public static int sumOfDivisors(int numberA, int numberB) {
		if (numberA > numberB) {
			int buff = numberA;
			numberA = numberB;
			numberB = buff;
		}

		int sumDivisors = 0;
		for (int i = numberA; i <= numberB; i++) {
			for (int j = i; j > 0; j--) {
				if (i%j == 0) {
					sumDivisors += j;
				}
			}
		}
		return sumDivisors;
	}
	
	public static void main(String[] args) {
		sc1 = new Scanner(System.in);
		int num1 = sc1.nextInt();
		sc2 = new Scanner(System.in);
		int num2 = sc2.nextInt();
		
		int sumDivisors = sumOfDivisors(num1, num2);
		System.out.print(sumDivisors);
	}
}
