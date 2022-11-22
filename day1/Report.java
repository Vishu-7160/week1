package week1.day1;

public class Report 
{
	public static void main(String[] args) 
	{
		Student stud = new Student();
		System.out.println("Name of the student is "+stud.studenName);
		System.out.println("Roll no. of the student is "+stud.rollNo);
		System.out.println("College name is "+stud.collegeName);
		System.out.println("Marks scored is "+stud.marksScored);
		System.out.println("CGPA "+stud.cgpa);
	}
}
