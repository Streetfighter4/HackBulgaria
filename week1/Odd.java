import java.util.Scanner;
import java.lang.Math;


class Odd {
	public static boolean isNumberOdd (int i) {
		if (i % 2 == 1) {
			return true;
	    } else {
	    	return false;
	    }
	}

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
	boolean bool = false;

	if (i < 0) {
		i = Math.abs(i);
	}

	bool = isNumberOdd(i);   
	
	if (bool) {
		System.out.print(sc.nextLine() + "odd\n");
	} else {
		System.out.print(sc.nextLine() + "even\n");
	}

	}	
}