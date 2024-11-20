package Question1PP;

import java.util.Scanner;

public class Manager extends Employee {
	private String department;
	private int prodNo1;
	private int prodNo2;
	private int prodNo3;

	public Manager(String EmpId, String name, String Address, String department, int prodNo1, int prodNo2,
			int prodNo3) {
		super(EmpId, name, Address);
		this.department = department;
		this.prodNo1 = prodNo1;
		this.prodNo2 = prodNo2;
		this.prodNo3 = prodNo3;
	}

	@Override
	public void Read() {
		super.Read();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Department : ");
		this.department = sc.nextLine();
		
		try {
			System.out.println("Enter product number 1 : ");
			this.prodNo1 = sc.nextInt();
			
			System.out.println("Enter product number 2 : ");
			this.prodNo2 = sc.nextInt();
			
			System.out.println("Enter product number 3 : ");
			this.prodNo3 = sc.nextInt();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void Print() {
		super.Print();
		System.out.println("Employee Deparment is : "+this.department);
		System.out.println("Leading first product is  "+this.prodNo1);
		System.out.println("Leading second product is  "+this.prodNo2);
		System.out.println("Leading Third product is  "+this.prodNo3);
	}
}
