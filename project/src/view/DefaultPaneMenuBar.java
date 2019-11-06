package view;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;


public class DefaultPaneMenuBar {
	
	private Menu menuFile;
	private MenuItem menuItemSave;
	private MenuItem menuItemRestore;
	private Menu menuGenerate;
	private MenuItem menuItemPeople;
	private MenuItem menuItemTextbook;
	private MenuItem menuItemClassroom;
	private MenuBar menuBar;
	public DefaultPaneMenuBar(){
		menuFile = new Menu("File"); 
        menuItemSave = new MenuItem("Save"); 
        menuItemRestore = new MenuItem("Restore"); 
		menuFile.getItems().add(menuItemSave); 
		menuFile.getItems().add(menuItemRestore); 
		menuGenerate = new Menu("Generate"); 
		menuItemPeople = new MenuItem("People Objects"); 
		menuItemTextbook = new MenuItem("Textbook Objects"); 
		menuItemClassroom = new MenuItem("Classroom Objects"); 
        menuGenerate.getItems().add(menuItemPeople);	
        menuGenerate.getItems().add(menuItemTextbook);	
        menuGenerate.getItems().add(menuItemClassroom);	
		menuBar = new MenuBar(); 
        menuBar.getMenus().add(menuFile);
        menuBar.getMenus().add(menuGenerate);
        setBtnListener();
	}

	public MenuBar getMenuBar() {
		return menuBar;
	}
	
	private void setBtnListener() {
		menuItemSave.setOnAction(e -> {
			System.out.println("save");
		});
		
		menuItemRestore.setOnAction(e -> {
			System.out.println("restore");
		});
		menuItemPeople.setOnAction(e -> {
		
		});
		
		menuItemTextbook.setOnAction(e -> {
			System.out.println("textbook");
		});
		menuItemClassroom.setOnAction(e -> {
			System.out.println("classroom");
		});
	}
}
