package OOPConcepts;


import java.util.Scanner;


public class Starter {

	public static void main(String[] args) {
		Person person1 = new Person("Tom Smith", 19, 'M');
		Person person2 = new Person("Sheena Anderson", 35, 'F');
		Person person3 = new Person();
		
		person1.display();
		person1.checkTwentyOne();;
		person2.display();
		person2.checkTwentyOne();;
		person3.display();
		
		int numInt;
		String nameString;
		int intAge;
		char genderString;
		double salaryDouble;
		
		int studentIDint;
		int studentSubject1;
		int studentSubject2;
		int studentSubject3;
		String studentMajor;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("employee ID: ");
		numInt=scan.nextInt();
		
		scan.nextLine();
		System.out.println("employee NAME: ");
		nameString=scan.nextLine();

		System.out.println("employee AGE: ");
		intAge=scan.nextInt();
		
		scan.nextLine();
		System.out.println("employee GENDER: ");
		genderString=scan.next().charAt(0);
		
		scan.nextLine();
		System.out.println("employee SALARY: ");
		salaryDouble=scan.nextDouble();

		Employee employeeUserInput = new Employee(numInt, nameString, intAge, genderString, salaryDouble);
		employeeUserInput.display();


		System.out.println("student ID: ");
		studentIDint=scan.nextInt();
		

		System.out.println("student Subject #1: ");
		studentSubject1=scan.nextInt();
		

		System.out.println("student Subject #2: ");
		studentSubject2=scan.nextInt();
		

		System.out.println("student Subject #3: ");
		studentSubject3=scan.nextInt();


		System.out.println("student Major: ");
		studentMajor=scan.nextLine();
		
		
		Student student1 = new Student(studentIDint, studentSubject1, studentSubject2, studentSubject3, studentMajor);
		student1.display();
		

		
		scan.close();
		
//		Student(int stud_id, String subject1, String subject2, String subject3, String major, int totalscore)
		
		
	}
}

// Employee(int id, String name, int age, char gender, double salary)