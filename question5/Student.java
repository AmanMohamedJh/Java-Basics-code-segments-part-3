package question5;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	private String studentId;
	private String name;
	private String address;
	private String contactNumber;

	public Student(String studentId, String name, String address, String contactNumber) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
	}

	void Read() {
		System.out.println("Enter the student id : ");
		studentId = sc.next();

		System.out.println("Enter the student name : ");
		name = sc.next();

		System.out.println("Enter the student address : ");
		address = sc.next();

		System.out.println("Enter the student contact number : ");
		contactNumber = sc.next();

	}

	void Print() {
		System.out.println("student id : " + studentId);
		System.out.println("student name : " + name);
	}

}

class Course {

	private String CourseId;
	private String name;
	private String instructor;

	public Course(String CourseId, String name, String instructor) {
		super();
		this.CourseId = CourseId;
		this.name = name;
		this.instructor = instructor;
	}

	Scanner sc = new Scanner(System.in);

	void Read() {
		System.out.println("Enter the CourseId  : ");
		CourseId = sc.next();

		System.out.println("Enter the student name : ");
		name = sc.next();

		System.out.println("Enter the instructor: ");
		instructor = sc.next();

	}
	
	void AddStudent(Student std) {
		
		
		
	}

}
