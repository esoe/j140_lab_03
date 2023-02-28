package ru.molokoin;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class StageLogin extends Stage{
    
    public void init() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(root);
        setTitle("Авторизация");
        setScene(scene);
        show();
    }
}
