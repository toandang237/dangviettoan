package com.mycompany.bmi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class PrimaryController {
    @FXML private TextField txtHeight;
    @FXML private TextField txtWeight;
    @FXML private Label lbResult;
    
    public void BMIHandler(ActionEvent event) {
        double height = Double.parseDouble(txtHeight.getText());
        double weight = Double.parseDouble(txtWeight.getText());
        double bmi = weight / Math.pow(height, 2);
        
        lbResult.setTextFill(Color.AQUA);
        if (bmi < 18.5)
            lbResult.setText("Gầy");
        else if (bmi < 25.5)
            lbResult.setText("Bình thường");
        else {
            lbResult.setTextFill(Color.RED);
            lbResult.setText("Thừa cân");
        }
    }
    
}
