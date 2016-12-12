package hack.bulgaria.java.sorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
	public static int[] selectionSort(int[] array) {
		System.out.println("In function");
		for (int i = 0; i < array.length - 1; i++) {
			int jMin = i; 
			for (int j = i+1; j < array.length; j++) {
				if (array[j] < array[jMin]) {
					jMin = j;
				}
			}
		
		
			if (jMin != i) {
				array[i] += array[jMin];
				array[jMin] = array[i] - array[jMin];
				array[i] -= array[jMin];
			}
		}
		return array;
	}
	
	public static int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length - 1; i++) {
			int value = array[i];
			int j = i - 1;
			while(j >= 0 && array[j] > value) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = value;
		}
		return array;
	}
	
	public static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j] < array[j - 1]) {
					array[j] += array[j - 1];
					array[j - 1] = array[j] - array[j - 1];
					array[j] -= array[j - 1];
				}
			}
		}
		return array;
	}
	
	public static Integer[] countSort(Integer[] array) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		int min = Collections.min(list);
		int max = Collections.max(list);
		int histogramSize = max - min + 1;
		
		int[] histogram = new int[histogramSize];
		for (Integer integer : array) {
			histogram[integer - min]++;
		}
		
		int curr = 0;
		for (int i = min; i < max; i++) {
			while(histogram[i - min] > 0) {
				array[curr] = i;
				curr++;
				histogram[i - min]--;
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		Integer[] array = {-1, 72, -52, 0, 10, 200, 0, 1000};
		array = countSort(array);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

}
