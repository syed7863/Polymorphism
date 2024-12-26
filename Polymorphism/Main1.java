package syed;
class Student
{
	String name;
	int age;
	String department;
	
	//constructor
	public Student()
	{
		this.name="Unknown";
		this.age=20;
		this.department = "unassigned";
	}
	
	//Constructor with two parameters
	public Student(String name, int age, String department)
	{
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	//method to display student details
	public void displayDetails()
	{
		System.out.println("Name:"+this.name + ", Age:"+this.age + ", Department: "+ this.department);
	}
}

public class Main1 {

	public static void main(String[] args) {
		// create instances of Student using each constructor
		Student student1 = new Student();
		Student student2 = new Student("Alice", 22,"IT");
		Student student3 = new Student("Bob", 25, "Computer Science");
		
		//print details of each student
		student1.displayDetails();
		student2.displayDetails();
		student3.displayDetails();
		
		

	}

}
