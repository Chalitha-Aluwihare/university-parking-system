module com.example.universityparkingsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.universityparkingsystem to javafx.fxml;
    exports com.example.universityparkingsystem;
}