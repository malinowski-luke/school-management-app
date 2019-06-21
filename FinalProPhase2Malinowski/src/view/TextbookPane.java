package view;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import model.College.College;
import model.Textbook.Textbook;

public class TextbookPane {
	
	private TextField titleField;
	private TextField authorField;
	private TextField isbnField;
	private TextField priceField;
	private TextbookTextFields textbookTextFields;
	private Button insertButton;
	private Button removeButton;
	private Button findButton;
	private Button updateButton;
	private SharedButtons sharedButtons;
	private GridPane textbookGrid;
	private SharedGrid sharedGrid;
	
	
	public TextbookPane(){
		textbookTextFields = new TextbookTextFields();
		titleField = textbookTextFields.getTitleField();	
		authorField = textbookTextFields.getAuthorField();		
		isbnField = textbookTextFields.getIsbnField();
		priceField = textbookTextFields.getPriceField();		

		
		sharedButtons = new SharedButtons();
		insertButton = sharedButtons.getInsertButton();
		removeButton = sharedButtons.getRemoveButton();
		findButton = sharedButtons.getFindButton();
		updateButton = sharedButtons.getUpdateButton();
		setBtnListener();
	
		sharedGrid = new SharedGrid();
		textbookGrid = sharedGrid.getGrid();
		textbookGrid.add(titleField, 0, 0);
		textbookGrid.add(authorField, 0, 1);
		textbookGrid.add(priceField, 0, 2);
		textbookGrid.add(isbnField, 0, 3);
		textbookGrid.add(insertButton, 1, 0);
		textbookGrid.add(removeButton, 1, 1);
		textbookGrid.add(findButton, 1, 2);
		textbookGrid.add(updateButton, 1, 3);
	}

	public GridPane getTextbookGrid() {
		return textbookGrid;
	}
	
	College college = new College();
	Alert alert = new Alert(AlertType.INFORMATION);
	Textbook t1;
	public void setBtnListener() {
		insertButton.setOnAction(e -> {
			Textbook t1 = (Textbook)college.getTextbookBag().findByIsbn(isbnField.getText());
			String title  =	titleField.getText();
			String author  = authorField.getText();
			String isbn = isbnField.getText();
			String priceString = priceField.getText();		
			if(title.equals("")||author.equals("")||isbn.equals("")||priceString.equals("")){
				alert.setTitle("ERR");
				alert.setContentText("Please fill out the following fields!\n Title\n Author\n Isbn\n Price");
				alert.showAndWait();
			}
			else{
				alert.setTitle("Task Completed");
				alert.setContentText("Textbook Inserted");
				alert.showAndWait();
				double price = Double.parseDouble(priceString);
				t1 = new Textbook(title,author,isbn,price);
				titleField.clear();
				authorField.clear();
				isbnField.clear();
				priceField.clear();
				college.getTextbookBag().insert(t1);
				college.getTextbookBag().showBag();
			}
		});
		removeButton.setOnAction(e -> {
			String isbn = isbnField.getText();
			if(isbn.equals("")) {
				alert.setTitle("ERR");
				alert.setContentText("Please fill out the following field!\n Isbn Field");
				alert.showAndWait();
			}
			else{
				Textbook t1 = (Textbook)college.getTextbookBag().findByIsbn(isbn);
				if(t1==null) {
					alert.setTitle("ERR");
					alert.setContentText("Textbook Not Found\nCan't Delete Record");
					alert.showAndWait();
				}
				else {
					alert.setTitle("Task Completed");
					alert.setContentText("Textbook Deleted");
					alert.showAndWait();
					college.getTextbookBag().deleteByIsbn(isbn);
					college.getTextbookBag().showBag();
					titleField.clear();
					authorField.clear();
					isbnField.clear();
					priceField.clear();
				}
			}
		});
		findButton.setOnAction(e -> {
			String isbn = isbnField.getText();
			if(isbn.equals("")) {
				alert.setTitle("ERR");
				alert.setContentText("Please fill out the following field!\n Isbn Field");
				alert.showAndWait();
			}
			else{
				Textbook t1 = (Textbook)college.getTextbookBag().findByIsbn(isbn);
				if(t1==null) {
					alert.setTitle("ERR");
					alert.setContentText("Textbook Not Found\nCan't Delete Record");
					alert.showAndWait();
				}
				else {
					String title = t1.getBookTitle();
					String author = t1.getAuthor();
					String isbn1 = t1.getIsbn();
					String price = String.valueOf(t1.getPrice());
					titleField.setText(title);
					authorField.setText(author);
					isbnField.setText(isbn1);
					priceField.setText(price);
				}
			}
		});
		updateButton.setOnAction(e -> {
			Textbook t1 = (Textbook)college.getTextbookBag().findByIsbn(isbnField.getText());
			String title = titleField.getText();
			String author = authorField.getText();
			String isbn = isbnField.getText();
			String priceString = priceField.getText();		
			if(title.equals("")||author.equals("")||isbn.equals("")||priceString.equals("")){
				alert.setTitle("ERR");
				alert.setContentText("Textbook Not Selected");
				alert.showAndWait();
			}
			else {
				alert.setTitle("Task Completed");
				alert.setContentText("Textbook Information Updated");
				alert.showAndWait();
				double price = Double.parseDouble(priceString);
				t1.setBookTitle(title);
				t1.setAuthor(author);
				t1.setIsbn(isbn);
				t1.setPrice(price);
				college.getTextbookBag().showBag();
				titleField.clear();
				authorField.clear();
				isbnField.clear();
				priceField.clear();
			}
		});
	}
}
