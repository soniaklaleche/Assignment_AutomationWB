package java_session_12Nouvember;

public class Student {
	
	String name;
	int student_id;
	int age;
	public static  void main (String [] args) {

	Student S1=new Student("Aman", 90, 80);
	System.out.println(S1.name+ ""  +S1.student_id +"" +S1.age);
	
	Student S2=new Student("Sonia", 8, 70);
	System.out.println(S2.name+ ""  +S2.student_id +"" +S2.age);
	Student S3=new Student("Sarah", 7, 8);
	System.out.println(S3.name+ ""  +S3.student_id +"" +S3.age);
	}
	public Student(String name,int student_id,int age) {
	
		
		this.name=name;
		this.student_id=student_id;
		this.age=age;
	}
}
