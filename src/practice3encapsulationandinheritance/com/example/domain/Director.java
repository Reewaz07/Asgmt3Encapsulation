package practice3encapsulationandinheritance.com.example.domain;

import practice3encapsulationandinheritance.Manager;

public class Director extends  Manager{
	private double budget;

	public Director(int empid, String name, String ssn, double salary, String deptname,double budget) {
		super(empid, name, ssn, salary, deptname);
		// TODO Auto-generated constructor stub
		this.budget=budget;
	}

	public double getBudget() {
		return budget;
	}
	

}
