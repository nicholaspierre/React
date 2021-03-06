
import java.util.Scanner;

public class Mod3_Week1_HW1 {
	
	public static int add(int a, int b) { // Addition
		return a+b;
	}


	public static int subtract (int a, int b) { // Subtraction
		return a-b;
	}

	public static int multiply (int a, int b) { // Multiply
		return a*b;
	}

	public static int divide (int a, int b) { // Divide
		int quotientNum = a/b;
		int remainderNum = a%b;
		System.out.println("Quotient :" + quotientNum);
		System.out.println("Remainder :" + remainderNum);
		return quotientNum;
	}

	public static void main(String[] args) {
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println();
			System.out.println("Options: ");
			System.out.println("1: ADD");
			System.out.println("2: SUBTRACT");
			System.out.println("3: MULTIPLY");
			System.out.println("4: DIVIDE");
			System.out.println("5: EXIT");
			
			int option;
			System.out.println("Enter option: ");
			option=scan.nextInt();
			
			switch(option) {
			case 1:	System.out.print("Choose 1st number: ");
					int num1 = scan.nextInt();
					System.out.print("Choose 2nd number: ");
					int num2 = scan.nextInt();
					int resultAdd = add(num1, num2);
					System.out.println("Result is: " + resultAdd); // Add
					break;
			case 2:	System.out.print("Choose 1st number: ");
					int num3 = scan.nextInt();
					System.out.print("Choose 2nd number: ");
					int num4 = scan.nextInt();
					int resultSubtract = subtract(num3, num4);
					System.out.println("Result is: " + resultSubtract); // Subtract
					break;
			case 3:	System.out.print("Choose 1st number: ");
					int num5 = scan.nextInt();
					System.out.print("Choose 2nd number: ");
					int num6 = scan.nextInt();
					int resultMultiply = multiply(num5, num6);
					System.out.println("Result is: " + resultMultiply); // Multiply
					break;
			case 4:	System.out.print("Choose 1st number: ");
					int num7 = scan.nextInt();
					System.out.print("Choose 2nd number: ");
					int num8 = scan.nextInt();
					int quotientNum = num7/num8;
					int remainderNum = num7%num8;
					System.out.println("Quotient :" + quotientNum);
					System.out.println("Remainder :" + remainderNum);
					break;
			case 5:	System.exit(0);
			default: System.out.println("Please pick options 1 thru 4");
			
			scan.close();
			}
		}

	}

}

// System.exit(0);