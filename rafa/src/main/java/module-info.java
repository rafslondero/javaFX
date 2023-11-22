module com.mycompany.rafa {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.rafa to javafx.fxml;
    exports com.mycompany.rafa;
}
