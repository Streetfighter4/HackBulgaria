package hack.bulgaria.java.sorts;

public class Sorts {
	//{ -1, 72, -52, 0, 10, 200, 0, 1000 }
	public static int partition(int[] array, int from, int to) {
		System.out.println("In partition");
		int i = from, j = to;
		System.out.println("From" + from);
		System.out.println("To" + to);
		System.out.println("Array length: " + array.length);
		int pivotIndex = from + (int)(Math.random() * to);
		int pivot = array[pivotIndex];
		System.out.println(pivot);
		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int buff = array[i];
				array[i] = array[j];
				array[j] = buff;
				i++;
				j--;
			}
		}
		return i;
	}

	public static int[] quickSort(int[] array, int from, int to) {
		System.out.println("In");
		int index = partition(array, from, to);
		if (from < index - 1) {
			quickSort(array, from, index - 1);
		}
		if (index < to) {
			quickSort(array, index, to);
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array = { -1, 72, -52, 0, 10, 200, 0, 1000 };
	
		array = quickSort(array, 0, array.length-1);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

}
