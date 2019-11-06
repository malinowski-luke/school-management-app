package view;

import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class DefaultPane {
	
	private DefaultPaneMenuBar defaultPaneMenuBar;
	private MenuBar menuBar;
	private BorderPane borderPane;
	private Button viewStudentPane;
	private Button viewFacultyPane;
	private Button viewTextbookPane;
	private Button viewClassroomPane;
	private GetViewPanes getViewPanes;
	private DefaultPaneButtons defaultPaneButtons;
	private HBox bottomBox;
	private DefaultPaneBoxes defaultPaneBoxes;
	
	public DefaultPane() {
		defaultPaneMenuBar = new DefaultPaneMenuBar();
		menuBar = defaultPaneMenuBar.getMenuBar();
		defaultPaneButtons = new DefaultPaneButtons();
		viewStudentPane = defaultPaneButtons.getViewStudentPane();
		viewFacultyPane =  defaultPaneButtons.getViewFacultyPane();
		viewTextbookPane = defaultPaneButtons.getViewTextbookPane();
		viewClassroomPane = defaultPaneButtons.getViewClassroomPane();	    
	    getViewPanes = new GetViewPanes();
	    setBtnListener();
	    
	    defaultPaneBoxes = new DefaultPaneBoxes();
	    bottomBox = defaultPaneBoxes.getBottomBox();
		bottomBox.getChildren().addAll(viewStudentPane,viewFacultyPane,viewTextbookPane,viewClassroomPane);
			    
	    borderPane = new BorderPane();
	    borderPane.setBottom(bottomBox);
	    borderPane.setTop(menuBar);
	}
	public BorderPane getBorderPane() {
		return borderPane;
	}
	private void setBtnListener() {
		viewStudentPane.setOnAction(e -> {
			borderPane.setCenter(getViewPanes.getStudentPane().getStudentGrid());
		});
		
		viewFacultyPane.setOnAction(e -> {
			borderPane.setCenter(getViewPanes.getFacultyPane().getfacultyGrid());
		});
		
		viewTextbookPane.setOnAction(e -> {
			borderPane.setCenter(getViewPanes.getTextbookPane().getTextbookGrid());
		});
		
		viewClassroomPane.setOnAction(e -> {
			borderPane.setCenter(getViewPanes.getClassroomPane().getClassroomGrid());
		});
	}
}
