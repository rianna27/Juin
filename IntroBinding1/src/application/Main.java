package application;
	
import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			/*
			 * IntegerProperty a=new SimpleIntegerProperty(10); IntegerProperty b=new
			 * SimpleIntegerProperty(10);
			 * 
			 * b.bind(a.multiply(4));
			 * 
			 * System.out.println("La valeur de a est: " + a.getValue());
			 * System.out.println("La valeur de a est: " + b.getValue());
			 * 
			 * a.set(50);
			 * 
			 * System.out.println("La valeur de a est: " + a.getValue());
			 * System.out.println("La valeur de a est: " + b.getValue());
			 */
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
