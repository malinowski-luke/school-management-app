package view;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import model.Person.Major;

public class StudentTextFields {
	
	private ComboBox<Major> majorField;
	private TextField gpaField;
	private Major major;
	
	public StudentTextFields() {
		majorField = new ComboBox();
		majorField.getItems().addAll(major.values());
		majorField.setPromptText("Major");
		
		gpaField = new TextField();
		gpaField.setEditable(false);
		gpaField.setPromptText("Gpa");
		
	}

	public ComboBox getMajorField() {
		return majorField;
	}

	public TextField getGpaField() {
		return gpaField;
	}
	
}
