package utils;

import java.util.Random;

public class GeneratePhone {

	public static String getOfficePhone() {
		Random rand = new Random();
		boolean chance = rand.nextBoolean();
		int num1 = rand.nextInt(641)+100;
		int num2 = rand.nextInt(8999)+1000;
		
		if(chance == true) {
			return "631-" + String.valueOf(num1)+ "-" + String.valueOf(num2);
		}
		else {
			return "516-" + String.valueOf(num1)+ "-" + String.valueOf(num2);
		}
	}
}
