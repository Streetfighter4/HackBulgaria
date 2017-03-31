import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
class FibonacciSequence {
	public static int[] fibonacciSequence(int number) {
		int fibonacciFirstBuff = 1;
		int fibonacciSecondBuff = 1;
		int fibonacciThirdBuff = 1;

		int[] fibonacciLine = new int[number];
		fibonacciLine[0] = fibonacciFirstBuff;
		fibonacciLine[1] = fibonacciSecondBuff;
		for (int i = 3; i <= number; i++) {
			fibonacciThirdBuff = fibonacciFirstBuff + fibonacciSecondBuff;
			fibonacciFirstBuff = fibonacciSecondBuff;
			fibonacciSecondBuff = fibonacciThirdBuff;

			fibonacciLine[i - 1] = fibonacciThirdBuff;
		}
		return fibonacciLine;
	}

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
	int[] fibonacciLine;

	if (i < 0) {
		i = Math.abs(i);
	}

	fibonacciLine = fibonacciSequence(i);   
	
	System.out.print("\n" + Arrays.toString(fibonacciLine));
	

	}	
}