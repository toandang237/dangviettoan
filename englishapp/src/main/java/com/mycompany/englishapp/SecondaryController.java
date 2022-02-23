package com.mycompany.englishapp;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    public void check(ActionEvent event) {
        int a = 10, b = 20;
        int c = a + b;
    }
}

