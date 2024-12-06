module com.javaassignment.finalfinal {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.javaassignment.finalfinal to javafx.fxml;
    exports com.javaassignment.finalfinal;
}