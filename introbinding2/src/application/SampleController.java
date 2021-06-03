package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;

public class SampleController implements Initializable{

    @FXML
    private ProgressBar mprogress;

    @FXML
    private ProgressIndicator mindicator;

    @FXML
    private Slider mslider;
    
    private Nombre1 num=new Nombre1();
   
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       num.setNombre1(0);
       mprogress.progressProperty().bind(num.nombreProperty());
       mindicator.progressProperty().bind(num.nombreProperty());
       mslider.valueProperty().bindBidirectional(num.nombreProperty());
    
    }
    
    @FXML
    private void ajouter()
    {
    	num.setNombre1(num.getNombre1()+ 0.1);
    }
    
    @FXML
    private void diminuer()
    {
    	num.setNombre1(num.getNombre1() - 0.1);
    }
    

    
}