package week02;

public class IntVector {
	int arr[] = new int[10];
	int size = 0;
	int capacity = 10;
	
	public IntVector() {
		
	}
	
	
	public IntVector(int[] temp) {
		
	}
	
	public IntVector(int capacity) {
		capacity = this.capacity;
		arr = new int[capacity];
	}
	
	public void add(int data) {
		if (size == capacity) {
			resize();
		}
		
		arr[size] = data;
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public void resize() {
		capacity *= 2;
		int[] temp = new int[capacity*2];
		for (int i = 0; i < size; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}
	
	public void set(int index, int data) {
		arr[index] = data;
	}
	
	
	public int get(int index) {
		return arr[index];
	}
	
	public String toString() {
		String result = "";
		
		for (int i = 0; i < size; i++) {
			result += arr[i] + ", ";
		}
		return "[" + result +"]";
	}
	
}
