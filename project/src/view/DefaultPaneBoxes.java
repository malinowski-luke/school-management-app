package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;

public class DefaultPaneBoxes {
	
	private HBox bottomBox;
	
	public DefaultPaneBoxes() {
		bottomBox = new HBox(50);
		bottomBox.setAlignment(Pos.CENTER);
		bottomBox.setPadding(new Insets(25, 25, 25, 25));   
	}

	public HBox getBottomBox() {
		return bottomBox;
	}	
}
