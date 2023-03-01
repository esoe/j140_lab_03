package ru.molokoin.domains;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Frame extends Stage{
    public void init(){
        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("dmains.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            setScene(scene);
            initModality(Modality.APPLICATION_MODAL);
            //((FXMLEducationController)loader.getController()).initTable(person);
            showAndWait();
        } catch (IOException e) {
            //Logger.getLogger(EducationStage.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ошибка domains.Frame.init()" + e.getMessage());
        }
    }
    
}
