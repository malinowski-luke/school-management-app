package model.Classroom;

import java.util.Random;

public enum Projector {
	Projector, No_Projector;
	
	public static Projector generateProjector(){
		Random rand = new Random();
		return values()[rand.nextInt(values().length)];
	}
	
}
