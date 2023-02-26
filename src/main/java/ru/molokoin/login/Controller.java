package ru.molokoin.login;

import java.io.IOException;
import javafx.fxml.FXML;

public class Controller {
    @FXML
    public void login() throws IOException {
        System.out.println("Инициирована авторизация пользователя ...");
        System.out.println("Открываем таблицу Persons ...");
    }
}
