package com.hackbulgaria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] arr = {1, 5, 8, 10, 0, 5, 0};
		Scanner sc = new Scanner(System.in);
		
		int index = sc.nextInt();
		int sum = 1;
		
		for (int i = 0; i < arr.length; i++) {
			if (i != index) {
				sum *= arr[i];
			}
		}
		System.out.println(sum);
	}
}
