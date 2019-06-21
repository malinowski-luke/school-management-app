package model.Person;

import utils.GenerateGpa;

public class Student extends Person {
	private Major major;
	private double gpa;
	
	public Student() {
		super();
		this.major = Major.generateMajor();
		this.gpa = GenerateGpa.getGpa();
	}
	
	public Student(String firstName,String lastName,String phone,Major major, double gpa) {
		super(firstName,lastName,phone);
		this.major = major;
		this.gpa = gpa;
	}
	
	public Major getMajor() {
		return major;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [major=" + major + ", gpa=" + gpa + " " + super.toString() + "]";
	}
	
}
