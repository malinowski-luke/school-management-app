package view;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import model.College.College;
import model.Person.Faculty;
import model.Person.Student;
import utils.GenerateSalary;

public class FacultyPane {
	private TextField firstNameField;
	private TextField lastNameField;
	private TextField idField;
	private TextField phoneField;
	private SharedTextFields sharedTextFields;
	private TextField salaryField;
	private FacultyTextFields facultyTextFields;
	private Button insertButton;
	private Button removeButton;
	private Button findButton;
	private Button updateButton;
	private SharedButtons sharedButtons;
	private GridPane facultyGrid;
	private SharedGrid sharedGrid;
	
	public FacultyPane(){
		sharedTextFields = new SharedTextFields();
		firstNameField = sharedTextFields.getFirstNameField();
		lastNameField = sharedTextFields.getLastNameField();
		idField =  sharedTextFields.getIdField();
		phoneField = sharedTextFields.getPhoneField();
		facultyTextFields = new FacultyTextFields();
		salaryField = facultyTextFields.getSalaryField();
		
		sharedButtons = new SharedButtons();
		insertButton = sharedButtons.getInsertButton();
		removeButton = sharedButtons.getRemoveButton();
		findButton = sharedButtons.getFindButton();
		updateButton = sharedButtons.getUpdateButton();
		setBtnListener();
		
		sharedGrid = new SharedGrid();
		facultyGrid = sharedGrid.getGrid();
		facultyGrid.add(firstNameField, 0, 0);
		facultyGrid.add(lastNameField, 0, 1);
		facultyGrid.add(idField, 0, 2);
		facultyGrid.add(phoneField, 0, 3);
		facultyGrid.add(salaryField, 0, 4);
		facultyGrid.add(insertButton, 1, 0);
		facultyGrid.add(removeButton, 1, 1);
		facultyGrid.add(findButton, 1, 2);
		facultyGrid.add(updateButton, 1, 3);	
	}
	
	public GridPane getfacultyGrid() {
		return facultyGrid;
	}
	
	College college = new College();
	Alert alert = new Alert(AlertType.INFORMATION);
	Faculty f1;
	public void setBtnListener() {
		insertButton.setOnAction(e -> {
			Faculty f1 = (Faculty)college.getPersonBag().findById(idField.getText());
			String firstName  =	firstNameField.getText();
			String lastName  =	lastNameField.getText();
			String phone = phoneField.getText();
			if(firstName.equals("")||lastName.equals("")||phone.equals("")){
				alert.setTitle("ERR");
				alert.setContentText("Please fill out the following fields!\n First Name\n LastName\n Phone Number\n Major");
				alert.showAndWait();
			}
			else{
				alert.setTitle("Task Completed");
				alert.setContentText("Faculty Inserted");
				alert.showAndWait();
				f1 = new Faculty(firstName,lastName,phone,GenerateSalary.getSalary());
				firstNameField.clear();
				lastNameField.clear();
				phoneField.clear();
				college.getPersonBag().insert(f1);
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
				Student f1 = (Student)college.getPersonBag().findById(idField.getText());
				if(f1==null) {
					alert.setTitle("ERR");
					alert.setContentText("Faculty Not Found\nCan't Delete Record");
					alert.showAndWait();
				}
				else {
					alert.setTitle("Task Completed");
					alert.setContentText("Faculty Deleted");
					alert.showAndWait();
					college.getPersonBag().deleteById(id);
					college.getPersonBag().showBag();
					firstNameField.clear();
					lastNameField.clear();
					phoneField.clear();
					idField.clear();
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
				Student f1 = (Student)college.getPersonBag().findById(idField.getText());
				if(f1==null) {
					alert.setTitle("ERR");
					alert.setContentText("Faculty Not Found");
					alert.showAndWait();
				}
				else {
					String firstName  =	f1.getFirstName();
					String lastName  =	f1.getLastName();
					String phone = f1.getPhone();
					firstNameField.setText(firstName);
					lastNameField.setText(lastName);
					phoneField.setText(phone);
					
				}
			}
		});
		updateButton.setOnAction(e -> {
			Student f1 = (Student)college.getPersonBag().findById(idField.getText());
			String firstName  =	firstNameField.getText();
			String lastName  =	lastNameField.getText();
			String phone = phoneField.getText();
			if(firstName.equals("")||lastName.equals("")||phone.equals("")) {
				alert.setTitle("Task Completed");
				alert.setContentText("No Student Selected");
				alert.showAndWait();
			}
			else {
				alert.setTitle("Task Completed");
				alert.setContentText("Student Information Updated");
				alert.showAndWait();
				f1.setFirstName(firstName);
				f1.setLastName(lastName);
				f1.setPhone(phone);
				firstNameField.clear();
				lastNameField.clear();
				phoneField.clear();
				idField.clear();
				college.getPersonBag().showBag();
			}
		});
	}
}
