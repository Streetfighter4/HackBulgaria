package sudoku.multitreading;

public class Sudoku {
	public static class Task implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		Task task = new Task();
		Thread thread = new Thread(task);
	}
}
