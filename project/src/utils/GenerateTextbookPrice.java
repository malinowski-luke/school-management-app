package utils;

import java.util.Random;

public class GenerateTextbookPrice {
	public static double getPrice() {
		Random rand = new Random();
		double price = ((double)rand.nextInt((250-100)+100)) + (Math.round(rand.nextDouble()*100.00)/100.0);
		return price;
	}
}
