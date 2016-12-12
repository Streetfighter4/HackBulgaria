package hb;

public class BinarySearch {

	public static int search(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int indexTarger = -1;
		
		while(low <= high) {
			int mid = low + ((high - low) / 2);
		
			if (arr[mid] == target) {
				indexTarger = mid;
				break;
			} else if (arr[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		return indexTarger;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 2, 3, 6, 20, 20, 10000};
		System.out.println("Index: " + search(arr, 20));
	}

}
