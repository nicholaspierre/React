package OOPConcepts;

public class Person {
	static int count = 0;
	String pname;
	int page;
	char pgender;
	
	public Person()
	{
		
	}
	
	public Person(String name, int age, char gender)
	{
		pname=name;
		page=age;
		pgender=gender;
		count++;
	}
	
	public void display()
	{
		System.out.println("Name: " +this.pname);
		System.out.println("Gender: " +this.pgender);
		System.out.println("Age: " +this.page);
		System.out.println(count);
	}

	public void checkTwentyOne()
	{
		if (this.page < 21) {
			System.out.println("You are under the age of 21 !");
		} else {
			System.out.println("You are OVER the age of 21 !");
		}
	}
}
