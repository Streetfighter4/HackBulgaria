package week02;

import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String newPolynomial = sc.nextLine();
		
		Polynomial pol = new Polynomial(newPolynomial);
	
		System.out.println(pol);
	}
}
