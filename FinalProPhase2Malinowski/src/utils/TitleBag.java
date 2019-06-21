package utils;

import java.util.Random;

public class TitleBag {
	private String [] titleArr;
	private int nElems;
	private Random rand;
	
	public TitleBag(int maxSize) {
		titleArr = new String[maxSize];
		nElems = 0;
	}
	public void insert(String title) {
		titleArr[nElems++] = title;
	}
	
	public String getTitle() {
		rand = new Random();
		return titleArr[rand.nextInt(titleArr.length)];
	}
}
