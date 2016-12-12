package com.hack.bulgaria;

public class Main {
	public static void main(String[] args) {
		
		Polynomial p = Polynomial.fromString("2x^4 + x^2 - 10x + 3");
		Polynomial p2 = Polynomial.fromString("2x^4 + x^4 + 20x + 3x^4");
		//2x^4+2x^3+6x^2+10x+6
		Polynomial p3 = p2.normalize();
		System.out.println(p3);
	}
}
