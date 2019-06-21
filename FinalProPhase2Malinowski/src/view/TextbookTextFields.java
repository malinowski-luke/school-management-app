package view;

import javafx.scene.control.TextField;

public class TextbookTextFields {
	private TextField titleField;
	private TextField authorField;
	private TextField isbnField;
	private TextField priceField;
	
	public TextbookTextFields() {
		titleField = new TextField();
		titleField.setPromptText("Title");
		authorField = new TextField();
		authorField.setPromptText("Author");
		priceField = new TextField();
		priceField.setPromptText("Price");
		isbnField = new TextField();
		isbnField.setPromptText("ISBN");
	}

	public TextField getTitleField() {
		return titleField;
	}

	public TextField getAuthorField() {
		return authorField;
	}

	public TextField getPriceField() {
		return priceField;
	}

	public TextField getIsbnField() {
		return isbnField;
	}
	
}
