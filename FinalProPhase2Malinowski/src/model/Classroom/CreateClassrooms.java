package model.Classroom;

public class CreateClassrooms {
	
	public static void CreateClassroom() {
		ClassroomBag classroomBag = new ClassroomBag(75);
		int counter = 0;
		while(counter<75){
			classroomBag.insert(new Classroom());
			counter++;
		}
	}
}
