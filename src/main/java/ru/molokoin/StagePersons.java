package ru.molokoin;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class StagePersons extends Stage{
    public void init(){
        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("persons.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            setScene(scene);
            //initModality(Modality.APPLICATION_MODAL);
            //((PersonsController)loader.getController()).initTable(person);
            showAndWait();
        } catch (IOException e) {
           System.out.println("Ошибка (PersonsStage.init()):" + e.getMessage());
        }
    }
}
