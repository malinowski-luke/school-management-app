package model.Person;

import utils.GenerateSalary;

public class Faculty extends Person{
	private double salary;
	
	public Faculty(String firstName,String lastName,String phoned,double salary) {
		super();
		this.salary = salary;
	}
	public Faculty() {
		this.salary = GenerateSalary.getSalary();
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Faculty [salary=" + salary + " " + super.toString() + "]";
	}
}
