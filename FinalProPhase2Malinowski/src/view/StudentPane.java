package view;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import model.College.College;
import model.Person.Major;
import model.Person.Student;
import utils.GenerateGpa;

public class StudentPane {
	
	private TextField firstNameField;
	private TextField lastNameField;
	private TextField idField;
	private TextField phoneField;
	private SharedTextFields sharedTextFields;
	private ComboBox<Major> majorField;
	private TextField gpaField;
	private StudentTextFields studentTextFields;
	private Button insertButton;
	private Button removeButton;
	private Button findButton;
	private Button updateButton;
	private SharedButtons sharedButtons;
	private GridPane studentGrid;
	private SharedGrid sharedGrid;
	
	@SuppressWarnings("unchecked")
	public StudentPane(){
		sharedTextFields = new SharedTextFields();
		firstNameField = sharedTextFields.getFirstNameField();
		lastNameField = sharedTextFields.getLastNameField();
		idField =  sharedTextFields.getIdField();
		phoneField = sharedTextFields.getPhoneField();
		
		studentTextFields = new StudentTextFields();
		majorField = studentTextFields.getMajorField();
		gpaField = studentTextFields.getGpaField();
		
		sharedButtons = new SharedButtons();
		insertButton = sharedButtons.getInsertButton();
		removeButton = sharedButtons.getRemoveButton();
		findButton = sharedButtons.getFindButton();
		updateButton = sharedButtons.getUpdateButton();
		setBtnListener();

		sharedGrid = new SharedGrid();
		studentGrid = sharedGrid.getGrid();
		studentGrid.add(firstNameField, 0, 0);
		studentGrid.add(lastNameField, 0, 1);
		studentGrid.add(idField, 0, 2);
		studentGrid.add(phoneField, 0, 3);
		studentGrid.add(majorField, 0, 4);
		studentGrid.add(gpaField, 0, 5);
		studentGrid.add(insertButton, 1, 0);
		studentGrid.add(removeButton, 1, 1);
		studentGrid.add(findButton, 1, 2);
		studentGrid.add(updateButton, 1, 3);	
	}
	
	
	public GridPane getStudentGrid() {
		return studentGrid;
	}


	College college = new College();
	Alert alert = new Alert(AlertType.INFORMATION);
	Student s1;
	public void setBtnListener() {
		insertButton.setOnAction(e -> {
			Student s1 = (Student)college.getPersonBag().findById(idField.getText());
			String firstName  =	firstNameField.getText();
			String lastName  =	lastNameField.getText();
			String phone = phoneField.getText();
			Major major = (Major)(majorField.getValue());
			if(firstName.equals("")||lastName.equals("")||phone.equals("")||major==null){
				alert.setTitle("ERR");
				alert.setContentText("Please fill out the following fields!\n First Name\n LastName\n Phone Number\n Major");
				alert.showAndWait();
			}
			else{
				alert.setTitle("Task Completed");
				alert.setContentText("Student Inserted");
				alert.showAndWait();
				s1 = new Student(firstName,lastName,phone,major,GenerateGpa.getGpa());
				firstNameField.clear();
				lastNameField.clear();
				phoneField.clear();
				majorField.setValue(null);
				college.getPersonBag().insert(s1);
				college.getPersonBag().showBag();
			}
		});
		
		removeButton.setOnAction(e -> {
			String id = idField.getText();
			if(id.equals("")) {
				alert.setTitle("ERR");
				alert.setContentText("Please fill out the following field!\n Id");
				alert.showAndWait();
			}
			else{
				Student s1 = (Student)college.getPersonBag().findById(idField.getText());
				if(s1==null) {
					alert.setTitle("ERR");
					alert.setContentText("Student Not Found\nCan't Delete Record");
					alert.showAndWait();
				}
				else {
					alert.setTitle("Task Completed");
					alert.setContentText("Student Deleted");
					alert.showAndWait();
					college.getPersonBag().deleteById(id);
					college.getPersonBag().showBag();
					firstNameField.clear();
					lastNameField.clear();
					phoneField.clear();
					majorField.setValue(null);
					idField.clear();
					gpaField.clear();
				}
			}
		});
		findButton.setOnAction(e -> {
			String id = idField.getText();
			if(id.equals("")) {
				alert.setTitle("ERR");
				alert.setContentText("Please fill out the following field!\n Id");
				alert.showAndWait();
			}
			else{
				//if
				Student s1 = (Student)college.getPersonBag().findById(idField.getText());
				if(s1==null) {
					alert.setTitle("ERR");
					alert.setContentText("Student Not Found");
					alert.showAndWait();
				}
				else {
					String firstName  =	s1.getFirstName();
					String lastName  =	s1.getLastName();
					String phone = s1.getPhone();
					Major major = s1.getMajor();
					double gpa = s1.getGpa();

					firstNameField.setText(firstName);
					lastNameField.setText(lastName);
					phoneField.setText(phone);
					majorField.setValue(major);
					gpaField.setText(String.valueOf(gpa));
				}
			}
		});
		updateButton.setOnAction(e -> {
			Student s1 = (Student)college.getPersonBag().findById(idField.getText());
			String firstName  =	firstNameField.getText();
			String lastName  =	lastNameField.getText();
			String phone = phoneField.getText();
			Major major = (Major)(majorField.getValue());
			if(firstName.equals("")||lastName.equals("")||phone.equals("")||major==null) {
				alert.setTitle("Task Completed");
				alert.setContentText("No Student Selected");
				alert.showAndWait();
			}
			else {
				alert.setTitle("Task Completed");
				alert.setContentText("Student Information Updated");
				alert.showAndWait();
				s1.setFirstName(firstName);
				s1.setLastName(lastName);
				s1.setPhone(phone);
				s1.setMajor(major);
				firstNameField.clear();
				lastNameField.clear();
				phoneField.clear();
				majorField.setValue(null);
				idField.clear();
				gpaField.clear();
				college.getPersonBag().showBag();
			}
		});
	}
}
