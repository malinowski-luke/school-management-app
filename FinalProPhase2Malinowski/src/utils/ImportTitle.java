package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImportTitle {
	private TitleBag titleBag;
	private Scanner scanner;
	
	public ImportTitle(TitleBag titleBag) {
		this.titleBag = titleBag;
	}
	
	public void importData(){	
		String title = "";
		try {
			scanner = new Scanner(new File("src/input_data/textbook_titles.txt"));
			while(scanner.hasNextLine()) {
				title = scanner.nextLine();
				titleBag.insert(title);
			}
				scanner.close();
			}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}	
}
