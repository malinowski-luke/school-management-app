package model.Person;

public class PersonBag{
	private Person [] personArr;
	private int nElems;
	
	public PersonBag(int maxSize) {
		personArr = new Person[maxSize];
		nElems = 0;
	}	
	public void insert(Person person) {
		personArr[nElems++] = person;
	}
	public Person findById(String id){
		for (int i = 0; i < nElems; i++){
			if (personArr[i].getId().equals(id)){
				return personArr[i];
			}
		}
		return null;
	}
	public Person deleteById(String id) {
		int i = 0;
		for(i =0; i < nElems; i++) {
			if(personArr[i].getId().equals(id)) {
				break;
			}
		}
		
		if( i == nElems ) { // not exist
			return null;
		} else { // found
			Person temp = personArr[i];
			for(int j = i; j < nElems-1; j++) {
				personArr[j] = personArr[j+1]; 
			}
			nElems--;
			return temp;
		}
	}
	public void showBag() {
		for(int i = 0; i<nElems; i++) {
			System.out.println(personArr[i]);
		}
	}
	
}
