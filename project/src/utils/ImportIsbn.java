package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImportIsbn {
	
	private IsbnBag isbnBag;
	private Scanner scanner;
	public ImportIsbn(IsbnBag isbnBag) {
		this.isbnBag = isbnBag;
	}
	public void importData(){	
		String isbn = "";
		try {
				scanner = new Scanner(new File("src/input_data/textbook_isbns.txt"));
				while(scanner.hasNextLine()) {
						isbn = scanner.nextLine();
						isbnBag.insert(isbn);
				}
				scanner.close();
			}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}	
}
