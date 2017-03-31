package week02;

public class Vector<T>{
	int size = 0;
	int capacity = 10;
	
	T[] arr = (T[])new Object[10];
	
	public Vector() {
		
	}
	
	public Vector(int capacity) {
		this.capacity = capacity;
		arr = (T[])new Object[capacity];
	}
	
	public void add(T data) {
		if(size == capacity) {
			resize();
		}
		
		arr[size] = data;
		size++;
	}
	
	public void resize() {
		capacity *= 2;
		T[] arr = (T[])new Object[capacity];
	}
	
}
