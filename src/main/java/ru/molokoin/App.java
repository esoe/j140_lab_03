package ru.molokoin;

import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Класс,запускающий работу приложения
 * -запуск сцены login
 */
public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        new StageLogin().init();
    }
    
    public static void main(String[] args) {
        launch();
    }

}