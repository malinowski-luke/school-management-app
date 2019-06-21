package utils;

import java.util.Random;

public class GenerateClassroomCapacity {
	
	public static String getClassroomCapacity() {
		Random rand = new Random();
		int [] classroomCapacityArr = {20,25,30,35};
		return String.valueOf(classroomCapacityArr[rand.nextInt(3)]);
	}
}
