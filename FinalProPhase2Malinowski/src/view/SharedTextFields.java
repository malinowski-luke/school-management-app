package view;

import javafx.scene.control.TextField;

public class SharedTextFields {
	
	private TextField firstNameField;
	private TextField lastNameField;
	private TextField idField;
	private TextField phoneField;
	
	public SharedTextFields() {
		firstNameField = new TextField();
		firstNameField.setPromptText("First Name");
		lastNameField = new TextField();
		lastNameField.setPromptText("Last Name");
		idField = new TextField();
		idField.setPromptText("Id");
		phoneField = new TextField();
		phoneField.setPromptText("Phone");
	}

	public TextField getFirstNameField() {
		return firstNameField;
	}

	public TextField getLastNameField() {
		return lastNameField;
	}

	public TextField getIdField() {
		return idField;
	}

	public TextField getPhoneField() {
		return phoneField;
	}
	
	
}
