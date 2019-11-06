package view;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import model.Classroom.BuildingName;
import model.Classroom.Projector;

public class ClassroomTextFields {
	private ComboBox <BuildingName> buildingField;
	private TextField roomNumberField;
	private TextField capacityField;
	private ComboBox <Projector> projectorField;
	private BuildingName buildingName;
	private Projector projector;
	
	public ClassroomTextFields() {
		buildingField = new ComboBox();
		buildingField.setPromptText("Building Name");
		buildingField.getItems().addAll(buildingName.values());
		roomNumberField = new TextField();
		roomNumberField.setPromptText("Room Number");
		capacityField = new TextField();
		capacityField.setPromptText("Capacity");
		projectorField = new ComboBox();
		projectorField.setPromptText("Projector");
		projectorField.getItems().addAll(projector.values());
	}

	public ComboBox getBuildingField() {
		return buildingField;
	}

	public TextField getRoomNumberField() {
		return roomNumberField;
	}

	public TextField getCapacityField() {
		return capacityField;
	}

	public ComboBox getProjectorField() {
		return projectorField;
	}
	
	
}
