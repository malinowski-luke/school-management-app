package view;

import javafx.scene.control.TextField;

public class FacultyTextFields {
	
	private TextField salaryField;
	
	public FacultyTextFields() {
		salaryField = new TextField();
		salaryField.setPromptText("Salary");
	}

	public TextField getSalaryField() {
		return salaryField;
	}
	
}
