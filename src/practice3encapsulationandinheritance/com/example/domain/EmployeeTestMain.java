package practice3encapsulationandinheritance.com.example.domain;

import practice3encapsulationandinheritance.Manager;

public class EmployeeTestMain {
	public static void main(String[] args) {
		Engineer eng = new Engineer(101, "JaneSmith", "012-34-5678", 120345.27);
		eng.printEmployee();
		System.out.println("-------------------------------------------------------");

		Manager mgr = new Manager(207, "Barbara johnson", "054-12-2367", 109501.36, "US Marketing");
		System.out.println("Department: " + mgr.getDeptname());
		mgr.printEmployee();
		System.out.println("----------------------------------");
		Admin adm = new Admin(304, "Bill Munroe", "108-23-6509", 75002.34);
		adm.printEmployee();

		System.out.println("----------------------------------");
		Director director = new Director(12, "Susan Wheeler", "099-45-2340", 120567.36, "Global Marketig",
				1_000_000.00);
		System.out.println("Budget :" + director.getBudget());
		director.raiseSalary(70000);
		director.printEmployee();
		System.out.println("Department: " + mgr.getDeptname());
		System.out.println("--------------------------------");

	}

}
