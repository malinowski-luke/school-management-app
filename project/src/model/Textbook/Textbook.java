package model.Textbook;

import utils.FormatEmitNames;
import utils.GenerateTextbookPrice;
import utils.ImportIsbn;
import utils.ImportTitle;
import utils.IsbnBag;
import utils.TitleBag;

public class Textbook {
	
	private String bookTitle;
	private String author;
	private String isbn;
	private double price;
	
	public Textbook(String bookTitle, String author, String isbn, double price) {
		this.bookTitle = bookTitle;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
	}
	public Textbook() {
		IsbnBag isbnBag = new IsbnBag(38640);
		ImportIsbn importIsbn = new ImportIsbn(isbnBag);
		importIsbn.importData();
		TitleBag titleBag = new TitleBag(38640);
		ImportTitle importTitle = new ImportTitle(titleBag);
		importTitle.importData();
		this.bookTitle = titleBag.getTitle();
		this.author = FormatEmitNames.emitFirstName() + " " + FormatEmitNames.emitLastName();
		this.isbn = isbnBag.getIsbn();
		this.price = GenerateTextbookPrice.getPrice();
	}

	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Textbook [bookTitle=" + bookTitle + ", author=" + author + ", isbn=" + isbn + ", price=" + price + "]";
	}
	
}
