package view;

import javafx.scene.control.Button;

public class SharedButtons {
	private Button insertButton;
	private Button removeButton;
	private Button findButton;
	private Button updateButton;
	
	public SharedButtons() {
		
		insertButton = new Button("Insert");
		insertButton.setPrefSize(100, 50);
		removeButton = new Button("Remove");
		removeButton.setPrefSize(100, 50);
		findButton = new Button("Find");
		findButton.setPrefSize(100, 50);
		updateButton = new Button("Update");
		updateButton.setPrefSize(100, 50);
	
	}

	public Button getInsertButton() {
		return insertButton;
	}

	public Button getRemoveButton() {
		return removeButton;
	}

	public Button getFindButton() {
		return findButton;
	}

	public Button getUpdateButton() {
		return updateButton;
	}
	
}

