package OOPConcepts;

public class Student extends Person {
	
	int stud_id;
	int subject1;
	int subject2;
	int subject3;
	String major;
	int totalscore;
	
	public Student(int stud_id, int subject1, int subject2, int subject3, String major)
	{
		
		stud_id=this.stud_id;
		subject1=this.subject1;
		subject2=this.subject2;
		subject3=this.subject3;
		major=this.major;
		

	}
	
	public void()
	{
		System.out.println("Id : " + this.stud_id);
		System.out.println("Subject 1 :" + this.subject1);
		System.out.println("Subject 2 :" + this.subject2);
		System.out.println("Subject 3 :" + this.subject3);
		System.out.println("Major :" + this.major);
		System.out.println("Total Score :" + (this.subject1 + this.subject2 + this.subject3) );
	}

}
