package ru.molokoin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.molokoin.login.Frame;

import java.io.IOException;

/**
 * Класс,запускающий работу приложения
 * -запуск сцены login
 */
public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // new Frame().init();
        stage = new Frame();
        ((Frame) stage).init();
        // Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        // Scene scene = new Scene(root);
        // stage.setTitle("Авторизация");
        // stage.setScene(scene);
        // stage.show();
    }
    @Override
    public void init() throws IOException {
        // new Frame().init();
        // stage = new Frame();
        // ((Frame) stage).init();
        // Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        // Scene scene = new Scene(root);
        // stage.setTitle("Авторизация");
        // stage.setScene(scene);
        // stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}