// Author: Rianna Smuk
// Date: 3 Juin 2021
//code qui permet d'ajouter deux nomber ensemble sans utiliser le javaFx (scene builder)


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Calculer extends Application {

	@Override
	public void start(Stage primaryStage) 
	{
		Group group = new Group();
		Scene scene=new Scene(group,400,400);
		
		TextField txt1=new TextField("0");
		TextField txt2=new TextField("0");
		Label lbl1=new Label("0");
		Label lbl2=new Label("+");
		Label lbl3=new Label("0");
		Label lbl4=new Label("=");
		Label lbl5=new Label("0");
		
		txt1.setLayoutX(100);
		txt1.setLayoutY(100);
		
		txt2.setLayoutX(100);
		txt2.setLayoutY(140);
		
		lbl1.setLayoutX(100);
		lbl1.setLayoutY(180);
		
		lbl2.setLayoutX(120);
		lbl2.setLayoutY(180);
		
		lbl3.setLayoutX(140);
		lbl3.setLayoutY(180);
		
		lbl4.setLayoutX(160);
		lbl4.setLayoutY(180);
		
		lbl5.setLayoutX(180);
		lbl5.setLayoutY(180);
		
		lbl1.textProperty().bind(txt1.textProperty());
		lbl3.textProperty().bind(txt2.textProperty());
		
		lbl3.textProperty().addListener((observable,oldValue,newValue) -> 
		{
			if(!newValue.matches("^[0-9](\\.[0.9]+)?$"))
			{
				txt2.setText(newValue.replaceAll("[^\\d*\\.]", ""));
			}
			lbl5.setText(Integer.toString((checkLabel(lbl1)) + checkLabel(lbl3)));
		});
		
		lbl2.textProperty().addListener((observable,oldValue,newValue) -> 
		{
			if(!newValue.matches("^[0-9](\\.[0.9]+)?$"))
			{
				txt1.setText(newValue.replaceAll("[^\\d*\\.]", ""));
			}
			lbl5.setText(Integer.toString((checkLabel(lbl1)) + checkLabel(lbl3)));
		});
		
		
		
		group.getChildren().addAll(txt1,txt2,lbl1,lbl2,lbl3,lbl4,lbl5);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("addition");
		primaryStage.show();
		
	}
		
		
		int checkLabel(Label a)		
{
	int val;
	if(a.getText().equals(""))
		val=0;
	else
		val=Integer.parseInt(a.getText());
	return val;
}
	

	public static void main(String[] args) {
		launch(args);
	}
}
