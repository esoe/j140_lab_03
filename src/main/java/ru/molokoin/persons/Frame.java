package ru.molokoin.persons;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Frame extends Stage{
    public Frame(){
        //Parent root;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("persons.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            setScene(scene);
            show();
        } catch (IOException e) {
            System.out.println("Ошибка persons.Frame.init()" + e.getMessage());
        }

    }
    public void init(){
        //Parent root;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("persons.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            setScene(scene);
            show();
        } catch (IOException e) {
            System.out.println("Ошибка persons.Frame.init()" + e.getMessage());
        }
    }
    
}
