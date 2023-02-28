package ru.molokoin;

import java.io.IOException;
import java.util.List;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class StageDomains extends Stage{
    public void init(List<CoverDomain> domains){
        Parent root;
        try {
            System.out.println("Подключаем domains.fxml");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("domains.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            setScene(scene);
            //initModality(Modality.APPLICATION_MODAL);
            ((ControllerDomains)loader.getController()).initTable(domains);
            //showAndWait();
            show();
        } catch (IOException e) {
           System.out.println("Ошибка (StageDomains.init()):" + e.getMessage());
        }
    }
    
}
