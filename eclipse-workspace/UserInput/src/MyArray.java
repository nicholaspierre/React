import java.util.Scanner;

public class MyArray {

	public static void main(String[] args) {

		int num=10;
		
		int[] num1 = new int[] {10,20,30,40,50};
		int num2[] = new int[10];
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter some numbers");
		for(int i=0; i<num2.length; i++) 
		{
			num2[i] = scan.nextInt();
		}
		
		System.out.println("Array values are:");
		for (int i=0; i<num2.length; i++)
		{
			System.out.println(num2[i]);
		}
	}

}
