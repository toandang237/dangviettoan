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
        int a = 100, b = 200;
        int c = a + b;
    }
}

