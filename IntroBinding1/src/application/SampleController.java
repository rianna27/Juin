package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController implements Initializable{

    @FXML
    private TextField txt2;

    @FXML
    private TextField txt1;

    @FXML
    private Label lbl1;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	lbl1.textProperty().bind(txt1.textProperty());
    	
    }

}

