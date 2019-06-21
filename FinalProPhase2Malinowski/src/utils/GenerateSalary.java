package utils;

import java.util.Random;

public class GenerateSalary {
	public static double getSalary() {
		Random rand = new Random();
		return ((double)(rand.nextInt(30000)))+40000.00;
	}
}
