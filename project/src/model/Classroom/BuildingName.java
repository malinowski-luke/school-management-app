package model.Classroom;

import java.util.Random;

public enum BuildingName {
	Riverhead,Islip,Smithtown,Nfl;
	
	public static BuildingName getBuildingName() {
		Random rand = new Random();
		return values()[rand.nextInt(values().length)];
	}
}
