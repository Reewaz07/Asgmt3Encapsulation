package practice3encapsulationandinheritance;

public class Employee {
	private int empid;
	private String name;
	private String ssn;
	private double Salary;

	public Employee(int empid, String name, String ssn, double salary) {

		this.empid = empid;
		this.name = name;
		this.ssn = ssn;
		Salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public String getName() {
		return name;
	}

	public String getSsn() {
		return ssn;
	}

	public double getSalary() {
		return Salary;
	}

	public double raiseSalary(double increase) {
		return Salary += increase;
	}

	public void printEmployee() {
		System.out.println("Employee name: " + name);
		System.out.println("Employee id: " + empid);
		System.out.println("Employee ssn: " + ssn);
		System.out.println("Employee salary: " + Salary);

	}

}
