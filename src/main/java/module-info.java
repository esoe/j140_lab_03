module ru.molokoin {
    requires javafx.controls;
    requires javafx.fxml;

    opens ru.molokoin to javafx.fxml;
    exports ru.molokoin;
}
