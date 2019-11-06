package model.Classroom;

import utils.GenerateClassroomCapacity;
import utils.GenerateClassroomNumber;

public class Classroom {
	
	private BuildingName buildingName;
	private String roomNumber;
	private String capacity;
	private Projector projector;

	public Classroom(BuildingName buildingName, String roomNumber, String capacity, Projector projector) {
		this.buildingName = buildingName;
		String buildingNameLetter = String.valueOf(buildingName);
		this.roomNumber = buildingNameLetter.charAt(0)+roomNumber;
		this.capacity = capacity;
		this.projector = projector;
	}
	
	public Classroom() {
		this.buildingName = BuildingName.getBuildingName();
		String buildingNameLetter = String.valueOf(buildingName);
		this.roomNumber = buildingNameLetter.charAt(0)+GenerateClassroomNumber.getClassroomNumber();
		this.capacity = GenerateClassroomCapacity.getClassroomCapacity();
		this.projector = Projector.generateProjector();
	}

	public BuildingName getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(BuildingName buildingName) {
		this.buildingName = buildingName;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public Projector getProjector() {
		return projector;
	}
	public void setProjector(Projector projector) {
		this.projector = projector;
	}

	@Override
	public String toString() {
		return "Classroom [buildingName=" + buildingName + ", roomNumber=" + roomNumber + ", capacity=" + capacity
				+ ", projector=" + projector + "]";
	}
	
}
