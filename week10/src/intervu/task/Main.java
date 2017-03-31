package intervu.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static Function parseFunction (String function) {
		Function parsedFunction = null;
		int indexOfLastSpace = 0;
		int numSpace = 1;
		int i = 0;
		String functionName = null;
		String functionTakeArguent = null;
		String functionReturnAgrument = null;
		for (char c : function.toCharArray()) {
			if (c == ' ' && numSpace == 1) {
				functionName = function.substring(indexOfLastSpace, i);
				indexOfLastSpace = i;
				numSpace++;
			} else if (c == ' ' && numSpace == 2) {
				functionTakeArguent = function.substring(indexOfLastSpace, i);
				indexOfLastSpace = i;
				numSpace++;
			} else if (c == ' ' && numSpace == 3) {
				functionReturnAgrument = function.substring(indexOfLastSpace, i);
				indexOfLastSpace = i;
				numSpace++;
			}
			i++;
		}
		parsedFunction.setName(functionName);
		parsedFunction.setTakeArgument(functionTakeArguent);
		parsedFunction.setReturnArgument(functionReturnAgrument);
		return parsedFunction;
	}
	
	//public static List<String> parse
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List <Function> list = new ArrayList<>();
		int i = 0;
		while (true) {
			String newLine =  sc.nextLine();
			if (newLine.indexOf(':') > 0) {
				list.add(parseFunction(newLine));
			} else if (newLine.indexOf('.') > 0) {
				
				for (Function function : list) {
					
				}
		i++;
		}
		
		}
	}
}