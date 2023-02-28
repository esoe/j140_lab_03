package ru.molokoin;

import java.io.IOException;
import javafx.fxml.FXML;

public class ControllerLogin {
    @FXML
    public void login() throws IOException {
        System.out.println("Инициирована авторизация пользователя ...");
        System.out.println("Открываем таблицу Persons ...");
        new StagePersons().init();
    }
}
