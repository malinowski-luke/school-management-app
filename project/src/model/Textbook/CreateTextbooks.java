package model.Textbook;

public class CreateTextbooks {
	public static void CreateTextbook() {
		TextbookBag textbookBag = new TextbookBag(1050);
		int counter = 0;
		while(counter<2000){
			textbookBag.insert(new Textbook());
			counter++;
		}
	}
}
