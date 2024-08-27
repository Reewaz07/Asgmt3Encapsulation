package practice3encapsulationandinheritance;

public class Manager extends Employee {
	private String deptname;
	
	public Manager(int empid, String name, String ssn, double salary,String deptname) {
		super(empid, name, ssn, salary);
		this.deptname=deptname;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	

}
