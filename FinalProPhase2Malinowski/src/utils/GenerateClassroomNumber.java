package utils;

import java.util.Random;

public class GenerateClassroomNumber {
	
	public static String getClassroomNumber() {
		Random rand = new Random();
		int buildingWingNumberArr[] = {1,2,3,4,5};
		String roomNumberArr[] = {"01","02","03","04","05","06","07","08","09","10"};

		String completeRoomNumber = String.valueOf(buildingWingNumberArr[rand.nextInt(buildingWingNumberArr.length)]) + 
				roomNumberArr[rand.nextInt(roomNumberArr.length)];
		
		return completeRoomNumber;
	}
}
