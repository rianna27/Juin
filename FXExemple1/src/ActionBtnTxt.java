

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ActionBtnTxt extends Application {

	@Override
	public void start(Stage primaryStage) 
	{
		Group group = new Group();
		Scene scene = new Scene(group,400,400);
		Button bouton= new Button();
		bouton.setText("Mon Bouton");
		bouton.setLayoutX(20);
		bouton.setLayoutY(20);
		
		bouton.setOnAction((event) -> 
		{
			System.out.println("Bouton cliqué");
		}
		);
		
		TextField txt = new TextField();
		txt.setLayoutX(20);
		txt.setLayoutY(60);
		
		/*
		 * txt.setOnAction((event -> { System.out.println("Texte =" + txt.getText()); }
		 * );
		 */
		
		txt.textProperty().addListener((observable,oldValue,newValue)->
		{
			System.out.println("nouveau texte = " + newValue);
		}
		
		);
		
		group.getChildren().add(bouton);
		group.getChildren().add(txt);
		
	primaryStage.setScene(scene);
	primaryStage.show();
		
		
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
