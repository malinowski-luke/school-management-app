package utils;

import java.util.Random;

import input_data.NameStorage;

public class FormatEmitNames {

	
	private static String firstNamesRaw = NameStorage.getBoysNames().replaceAll("[0123456789 	]","");
	private static String [] token = firstNamesRaw.split("[.]");
	private static String[] boysNamesArr = token;
	
	private static String girlsNamesRaw = NameStorage.getGirlsNames();
	private static String[] girlsNamesArr = girlsNamesRaw.split("[ 	]");
	
	private static String lastNamesRaw = NameStorage.getLastNames().replaceAll("[ 	]","");
	private static String [] lastNamesArr = lastNamesRaw.split("[\n]");
	
	static Random rand = new Random();
	
	public static String emitFirstName() {
		int chance =rand.nextInt(1);
		if (chance == 1) {
			return boysNamesArr[rand.nextInt(boysNamesArr.length)];

		}
		else {
			return girlsNamesArr[rand.nextInt(girlsNamesArr.length)];
		}
	}
	
	public static String emitLastName() {
		return lastNamesArr[rand.nextInt(lastNamesArr.length)];
	}
	
}
