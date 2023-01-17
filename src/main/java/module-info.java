module com.contas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    opens com.contas to javafx.fxml;
    exports com.contas;
}
