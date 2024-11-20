package Question1PP;

import java.util.Scanner;

public class Employee {
	private String EmpId;
	private String name;
	private String Address;
	
	public Employee(String EmpId, String name, String Address) {
		super();
		this.EmpId = EmpId;
		this.name = name;
		this.Address = Address;
	}
	
	public void Read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee id : ");
		this.EmpId= sc.nextLine();
		
		System.out.println("Enter the Employee Name : ");
		this.name=sc.nextLine();
		
		System.out.println("Enter the Employee Address : ");
		this.Address=sc.nextLine();
		
	}
	
	public void Print() {
		System.out.println("Employee id is : "+this.EmpId);
		System.out.println("Employee Name is : "+this.name);
		System.out.println("Employee address is : "+this.Address);
	}
	
	
	
}
