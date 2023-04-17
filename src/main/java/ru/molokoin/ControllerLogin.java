package ru.molokoin;

import java.io.IOException;
import java.util.Optional;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import ru.molokoin.access.User;

public class ControllerLogin {
    @FXML
    TextField loginField;
    @FXML
    PasswordField passwordField;
    @FXML
    public void login() throws IOException {
        System.out.println("Инициирована авторизация пользователя ...");
        //считываем данные пользователя
        User user = new User(loginField.getText(), passwordField.getText());
        //если проверка проведена успешно ...
        if (Repository.checkAccess(user)){
            System.out.println("Открываем таблицу Persons ...");
            new StagePersons().init();
        }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Указаны не верные учетные данные, попробуйте еще раз ...", ButtonType.OK);
            Optional<ButtonType> result = alert.showAndWait();
           if (result.isPresent() && result.get() == ButtonType.OK) {
                System.out.println("Пробуем еще раз ...");
            }
        }
    }
}
