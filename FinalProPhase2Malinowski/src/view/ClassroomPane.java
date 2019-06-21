package view;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import model.Classroom.BuildingName;
import model.Classroom.Classroom;
import model.Classroom.Projector;
import model.College.College;


public class ClassroomPane {

	private ComboBox buildingField;
	private TextField roomNumberField;
	private TextField capacityField;
	private ComboBox projectorField;
	private ClassroomTextFields classroomTextFields;
	private Button insertButton;
	private Button removeButton;
	private Button findButton;
	private Button updateButton;
	private SharedButtons sharedButtons;
	private GridPane classroomGrid;
	private SharedGrid sharedGrid;
	
	public ClassroomPane(){
		classroomTextFields = new ClassroomTextFields();
		buildingField = classroomTextFields.getBuildingField();
		roomNumberField = classroomTextFields.getRoomNumberField();
		capacityField = classroomTextFields.getCapacityField();
		projectorField = classroomTextFields.getProjectorField();
		
		sharedButtons = new SharedButtons();
		insertButton = sharedButtons.getInsertButton();
		removeButton = sharedButtons.getRemoveButton();
		findButton = sharedButtons.getFindButton();
		updateButton = sharedButtons.getUpdateButton();
		setBtnListener();
		
		sharedGrid = new SharedGrid();
		classroomGrid = sharedGrid.getGrid();
		classroomGrid.add(buildingField, 0, 0);
		classroomGrid.add(roomNumberField, 0, 1);
		classroomGrid.add(capacityField, 0, 2);
		classroomGrid.add(projectorField,0, 3);
		classroomGrid.add(insertButton, 1, 0);
		classroomGrid.add(removeButton, 1, 1);
		classroomGrid.add(findButton, 1, 2);
		classroomGrid.add(updateButton, 1, 3);	
	}

	public GridPane getClassroomGrid() {
		return classroomGrid;
	}
	
	College college = new College();
	Alert alert = new Alert(AlertType.INFORMATION);
	Classroom c1;
	public void setBtnListener() {
		insertButton.setOnAction(e -> {	
			BuildingName buildingName = (BuildingName) (buildingField.getValue());
			String buildingNameString = String.valueOf(buildingName);
			String roomNumber = roomNumberField.getText();
			String capacity = capacityField.getText() ;
			Projector projector = (Projector)(projectorField.getValue());
			if(buildingName==null||roomNumber.equals("")||capacity.equals("")||projector==null){
				alert.setTitle("ERR");
				alert.setContentText("Please fill out the following fields!\n Building Name\n Room Number\n Capacity\n Projector");
				alert.showAndWait();
			}
			else{
				alert.setTitle("Task Completed");
				alert.setContentText("Classroom Inserted");
				alert.showAndWait();
				c1 = new Classroom(buildingName,roomNumber,capacity,projector);
				college.getClassroomBag().insert(c1);
				college.getClassroomBag().showBag();
				buildingField.setValue(null);
				roomNumberField.clear();
				capacityField.clear();
				projectorField.setValue(null);
			}
		});
		removeButton.setOnAction(e -> {
			String roomNumber = roomNumberField.getText();
			if(roomNumber.equals("")) {
				alert.setTitle("ERR");
				alert.setContentText("Please fill out the following field!\n Room Number");
				alert.showAndWait();
			}
			else{
				Classroom c1 = (Classroom)college.getClassroomBag().findByRoomNumber(roomNumber);
				if(c1==null) {
					alert.setTitle("ERR");
					alert.setContentText("Classroom Not Found\nCan't Delete Record");
					alert.showAndWait();
				}
				else {
					alert.setTitle("Task Completed");
					alert.setContentText("Classroom Deleted");
					alert.showAndWait();
					college.getClassroomBag().deleteByRoomNumber(roomNumber);
					college.getClassroomBag().showBag();
					buildingField.setValue(null);
					roomNumberField.clear();
					capacityField.clear();
					projectorField.setValue(null);
				}
			}
		});
		
		findButton.setOnAction(e -> {
			String roomNumber = roomNumberField.getText();
			if(roomNumber.equals("")) {
				alert.setTitle("ERR");
				alert.setContentText("Please fill out the following field!\n Room Number");
				alert.showAndWait();
			}
			else{
				//if
				Classroom c1 = (Classroom)college.getClassroomBag().findByRoomNumber(roomNumber);
				if(c1==null) {
					alert.setTitle("ERR");
					alert.setContentText("Classroom Not Found");
					alert.showAndWait();
				}
				else {
					BuildingName buildingName =	c1.getBuildingName();
					String roomNumberSet = c1.getRoomNumber();
					String capacity = c1.getCapacity();
					Projector projector = c1.getProjector();
					buildingField.setValue(buildingName);
					roomNumberField.setText(roomNumberSet);
					capacityField.setText(capacity);
					projectorField.setValue(projector);
				}
			}
		});
		
		updateButton.setOnAction(e -> {
			BuildingName buildingName =	(BuildingName)(buildingField.getValue());
			String roomNumber = roomNumberField.getText();
			String capacity = capacityField.getText();
			Projector projector = (Projector)(projectorField.getValue());
			Classroom c1 = (Classroom)college.getClassroomBag().findByRoomNumber(roomNumber);

			if(buildingName==null||roomNumber.equals("")||capacity.equals("")||projector==null){
				alert.setTitle("ERR");
				alert.setContentText("Classroom not Selected");
				alert.showAndWait();
			}
			else {
				alert.setTitle("Task Completed");
				alert.setContentText("Classroom Information Updated");
				alert.showAndWait();
				c1.setBuildingName(buildingName);
				c1.setRoomNumber(roomNumber);
				c1.setCapacity(capacity);
				c1.setProjector(projector);
				college.getClassroomBag().showBag();				
				buildingField.setValue(null);
				roomNumberField.clear();
				capacityField.clear();
				projectorField.setValue(null);
			}
		});
	}
}
