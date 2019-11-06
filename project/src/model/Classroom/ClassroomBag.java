package model.Classroom;

public class ClassroomBag {
	private  Classroom [] classroomArr;
	private  int nElems;
	
	public ClassroomBag(int maxSize) {
		classroomArr = new Classroom[maxSize];
		nElems = 0;
	}	
	public void insert(Classroom classroom) {
		classroomArr[nElems++] = classroom;
	}
	public Classroom findByRoomNumber(String roomNumber){
		for (int i = 0; i < nElems; i++){
			if (classroomArr[i].getRoomNumber().equals(roomNumber)){
				return classroomArr[i];
			}
		}
		return null;
	}
	public Classroom deleteByRoomNumber(String roomNumber) {
		int i = 0;
		for(i =0; i < nElems; i++) {
			if(classroomArr[i].getRoomNumber().equals(roomNumber)) {
				break;
			}
		}
		if( i == nElems ) {
			return null;
		} 
		else {
			Classroom temp = classroomArr[i];
			for(int j = i; j < nElems-1; j++) {
				classroomArr[j] = classroomArr[j+1]; 
			}
			nElems--;
			return temp;
		}
	}
	public void showBag() {
		for(int i = 0; i<nElems; i++) {
			System.out.println(classroomArr[i]);
		}
	}
}
