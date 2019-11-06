package model.College;

import model.Person.Faculty;
import model.Person.PersonBag;
import model.Person.Student;

public class CreatePeople {
	College college;
	PersonBag personBag;
	public void createPeople() {
		personBag = new PersonBag(350);
		int counterS = 0;
		while(counterS<200){
			personBag.insert(new Student());
			counterS++;
		}
		int counterF = 0;
		while(counterF<100){
			personBag.insert(new Faculty());
			counterF++;
		}
	}
}
