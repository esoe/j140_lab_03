package ru.molokoin.domains;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Frame extends Stage{
    public Parent root;
    public Scene scene;
    public Frame() throws IOException{
        root = FXMLLoader.load(getClass().getResource("domains.fxml"));
        scene = new Scene(root);
        
    }
    public void init() throws IOException{
        setTitle("FRAME : Domains");
        setScene(scene);
        show();
    }
    
}
