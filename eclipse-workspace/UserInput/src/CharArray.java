import java.util.Scanner;

public class CharArray {

	public static void main(String[] args) {

		int num=10;
		
		int[] num1 = new int[] {10,20,30,40,50};
		int num2[] = new int[10];
		char somecharacters[] = new char[5];
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter some single characters");
		for(int i=0; i<somecharacters.length; i++) 
		{
			somecharacters[i] = scan.next().charAt(0);
		}
		
		System.out.println("Single char values you entered are:");
		for (int i=0; i<somecharacters.length; i++)
		{
			System.out.println(somecharacters[i]);
		}
	}

}
