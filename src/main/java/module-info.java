module whxper.sshmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens whxper.sshmanager to javafx.fxml;
    exports whxper.sshmanager;
}