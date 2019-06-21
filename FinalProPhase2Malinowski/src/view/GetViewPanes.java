package view;


public class GetViewPanes {
	private StudentPane studentPane;
	private FacultyPane facultyPane;
	private TextbookPane textbookPane;
	private ClassroomPane classroomPane;
	
	public GetViewPanes() {
		studentPane = new StudentPane();
		facultyPane = new FacultyPane();
		textbookPane = new TextbookPane();
		classroomPane = new ClassroomPane();
	}

	public StudentPane getStudentPane() {
		return studentPane;
	}

	public FacultyPane getFacultyPane() {
		return facultyPane;
	}

	public TextbookPane getTextbookPane() {
		return textbookPane;
	}

	public ClassroomPane getClassroomPane() {
		return classroomPane;
	}
}
