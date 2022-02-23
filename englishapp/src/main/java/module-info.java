module com.mycompany.englishapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.englishapp to javafx.fxml;
    exports com.mycompany.englishapp;
}
