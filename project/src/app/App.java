package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import view.DefaultPane;

public class App extends Application{
	private Scene scene;
	private DefaultPane defaultPane;
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage primaryStage){		
		try {
			DefaultPane defaultPane = new DefaultPane();
			scene = new Scene(defaultPane.getBorderPane(), 600, 700);

			primaryStage.setScene(scene);
			primaryStage.setTitle("College Management Program");
			primaryStage.show();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}