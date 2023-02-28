package ru.molokoin.persons;

import java.io.IOException;

import javafx.fxml.FXML;

public class Controller {
    @FXML
    public void info() throws IOException {
        System.out.println("Инициирован запрос данных о доменах пользователя ...");
        System.out.println("Открываем таблицу Domains ...");
        new ru.molokoin.domains.Frame().init();
    }
}