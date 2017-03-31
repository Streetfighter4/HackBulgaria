import java.util.Scanner;
import java.lang.Math;

class Prime {
	public static boolean isNumberPrime (int myNumber) {
		int i = 0;
		int count = 0;
		while (i <= myNumber) {
			i++;
			if (myNumber % i == 0) {
				count++;
			}
		}

		if (count == 2) {
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

	bool = isNumberPrime(i);   
	
	if (bool) {
		System.out.print(sc.nextLine() + "Prime\n");
	} else {
		System.out.print(sc.nextLine() + "Not Prime\n");
	}

	}	
}