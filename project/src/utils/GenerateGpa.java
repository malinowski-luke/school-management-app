package utils;

import java.util.Random;

public class GenerateGpa {
	public static double getGpa() {
		Random rand = new Random();
		double a1 = (double) rand.nextInt((4-1)+1)+1;
		double a2 = (Math.round(rand.nextDouble()*100.00)/100.0);
		double gpa = a1 + a2;
		if(gpa>4.0){
			return (Math.round(4*100.00)/100.0);
		}
		else{
			return gpa;
		}
		
	}
}
