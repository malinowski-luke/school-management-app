package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

public class SharedGrid {
	
	private GridPane grid;
	
	public SharedGrid(){
		grid = new GridPane();
		grid.setVgap(50);
		grid.setHgap(50);
		grid.setAlignment(Pos.CENTER);
		grid.setPadding(new Insets(50));	
	}

	public GridPane getGrid() {
		return grid;
	}
}
