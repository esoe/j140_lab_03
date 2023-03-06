package ru.molokoin;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ControllerDomains implements Initializable{
    @FXML
    private TableView<CoverDomain> table;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        table.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("id"));
        table.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("webname"));
        table.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("domainname"));
        table.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("ip"));
        table.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("datereg"));
        table.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("countryreg"));
        table.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("personid"));
    }
    public void initTable(List<CoverDomain> domains){
        ObservableList<CoverDomain> obsDomains = FXCollections.observableArrayList(domains);
        table.setItems(obsDomains);
    }
    
}
