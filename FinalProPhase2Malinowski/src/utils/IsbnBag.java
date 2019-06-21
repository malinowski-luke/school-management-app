package utils;

import java.util.Random;

public class IsbnBag {
	private String [] isbnArr;
	private int nElems;
	private Random rand;
	
	public IsbnBag(int maxSize) {
		isbnArr = new String[maxSize];
		nElems = 0;
	}
	public void insert(String isbn) {
		isbnArr[nElems++] = isbn;
	}
	public String getIsbn() {
		rand = new Random();
		return isbnArr[rand.nextInt(isbnArr.length)];
	}
	
}
