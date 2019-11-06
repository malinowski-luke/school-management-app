package utils;

public class CreateId {
	
	public static String formatId(int idLength, String idNumber) {
		String id = idNumber;
		for(int i = id.length(); i<idLength; i++) {
			id = "0" + id;
		}
		return id;
	}
//	test
//	public static void main(String[] args) {
//		System.out.println(formatId(8,"1"));
//	}
}
