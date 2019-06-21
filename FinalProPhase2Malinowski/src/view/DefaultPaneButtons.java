package view;

import javafx.scene.control.Button;

public class DefaultPaneButtons {
	private Button viewStudentPane;
	private Button viewFacultyPane;
	private Button viewTextbookPane;
	private Button viewClassroomPane;
	private Button saveBags;
	private Button restoreBags;
		
	public DefaultPaneButtons() {
		viewStudentPane = new Button("Student");
		viewFacultyPane = new Button("Faculty");
		viewTextbookPane = new Button("Textbook");
		viewClassroomPane = new Button("Classroom");
		
		viewStudentPane.setPrefSize(100, 50);
		viewFacultyPane.setPrefSize(100, 50);
		viewTextbookPane.setPrefSize(100, 50);
		viewClassroomPane.setPrefSize(100, 50);
	    
		saveBags = new Button("Save");
		restoreBags = new Button("Restore");
		
		saveBags.setPrefSize(100, 50);
		restoreBags.setPrefSize(100, 50);
		
	}

	public Button getViewStudentPane() {
		return viewStudentPane;
	}

	public Button getViewFacultyPane() {
		return viewFacultyPane;
	}

	public Button getViewTextbookPane() {
		return viewTextbookPane;
	}

	public Button getViewClassroomPane() {
		return viewClassroomPane;
	}

	public Button getSaveBags() {
		return saveBags;
	}

	public Button getRestoreBags() {
		return restoreBags;
	}

		
}
