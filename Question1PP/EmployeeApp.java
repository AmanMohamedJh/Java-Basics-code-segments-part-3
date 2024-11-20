package Question1PP;

import java.util.ArrayList;

public class EmployeeApp {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee("IT1001", "Aman", "Kandy"));
		emp.add(new Employee("IT1002", "mohamed", "colombo"));
		emp.add(new Manager("IT1003", "jh", "polgahawela","marketting",10001,10002,10003));
		emp.add(new Manager("IT1004", "kaali", "mawanella","Accounting",10004,10005,10006));
		
		for (Employee e : emp) {
			e.Print();
			System.out.println();
		}
	}

}
