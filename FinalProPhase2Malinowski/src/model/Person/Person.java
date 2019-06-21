package model.Person;

import utils.CreateId;
import utils.FormatEmitNames;
import utils.GeneratePhone;

public abstract class Person {
	
	private String firstName;
	private String lastName;
	private String id;
	private String phone;
	
	private static int idCounter = 1;	
	private final int ID_LENGTH = 8;

	public Person() {
		this.firstName = FormatEmitNames.emitFirstName();
		this.lastName = FormatEmitNames.emitLastName();
		this.id = CreateId.formatId(ID_LENGTH, String.valueOf(idCounter++));
		this.phone = GeneratePhone.getOfficePhone();
	}
	
	public Person(String firstName, String lastName,String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = CreateId.formatId(ID_LENGTH, String.valueOf(idCounter++));
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + ", phone=" + phone
				+ ", ID_LENGTH=" + ID_LENGTH + "]";
	}
	

}
