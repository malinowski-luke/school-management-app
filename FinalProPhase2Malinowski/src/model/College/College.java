package model.College;
import model.Classroom.ClassroomBag;
import model.Person.PersonBag;
import model.Textbook.TextbookBag;

public class College {
	
	private PersonBag personBag;
	private TextbookBag textbookBag;
	private ClassroomBag classroomBag;
	
	public College() {
		personBag = new PersonBag(350);
		textbookBag = new TextbookBag(350);
		classroomBag = new ClassroomBag(350);
	}
	public PersonBag getPersonBag() {
		return personBag;
	}
	public void setPersonBag(PersonBag personBag) {
		this.personBag = personBag;
	}
	public TextbookBag getTextbookBag() {
		return textbookBag;
	}
	public void setTextbookBag(TextbookBag textbookBag) {
		this.textbookBag = textbookBag;
	}
	public ClassroomBag getClassroomBag() {
		return classroomBag;
	}
	public void setClassroomBag(ClassroomBag classroomBag) {
		this.classroomBag = classroomBag;
	}
	
}
