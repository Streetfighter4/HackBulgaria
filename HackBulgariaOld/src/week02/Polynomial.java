package week02;

import java.util.Vector;

public class Polynomial {
	Vector<String[]> vec = new Vector<>();
	int arr[] = new int[10];
	int size = vec.size();
	int capacity = 10;
	
	public Polynomial(String pol) {
		vec = new Vector<>();
		String[] arr = pol.split("-|\\+");
		
		for (String string : arr) {
			String[] pair = string.split("x");
			System.out.println(pair[0] + " " + pair[1]);
		}
	}
	
}
