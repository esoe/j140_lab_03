package ru.molokoin.persons;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Controller {
    @FXML
    public void info() throws IOException {
        System.out.println("Инициирован запрос данных о доменах пользователя ...");
        System.out.println("Открываем таблицу Domains ...");
        new ru.molokoin.domains.Frame();
    }
}