module com.example.gui_practice {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;
    requires javafx.graphics;
    requires javafx.base;

    opens com.example.gui_practice to javafx.fxml;
    exports com.example.gui_practice;
}