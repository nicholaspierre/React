import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		int num;
		String name;
		String str;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a number: ");
		num=scan.nextInt();
		
		System.out.println("enter a word: ");
		str=scan.next();
		
		scan.nextLine();
		System.out.println("Enter your name: ");
		name=scan.nextLine();
		
		System.out.println("The number is: " + num);
		System.out.println("charAt [0]: " + name.charAt(0));
		System.out.println("Name Concat Word (String): " + name.concat(str));
		System.out.println("startsWith (String): " + name.startsWith("Nic"));
		System.out.println("endsWith (String): " + name.endsWith("las"));
		System.out.println("name.length (String): " + name.length());
		System.out.println("The name you entered is: " + name.toUpperCase());
		System.out.println("The name you entered is: " + name);
	}

}
