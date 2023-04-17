module ru.molokoin {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens ru.molokoin to javafx.fxml;
    exports ru.molokoin;
}
