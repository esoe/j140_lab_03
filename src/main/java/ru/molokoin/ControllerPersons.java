package ru.molokoin;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;


public class ControllerPersons implements Initializable{
    @FXML
    private TableView<CoverPerson> table;
    @FXML
    private TableColumn<CoverPerson, Integer> idColumn;
    @FXML
    private TableColumn<CoverPerson, String> jobtitleColumn;
    @FXML
    private TableColumn<CoverPerson, String> firstnamelastnameColumn;
    @FXML
    private TableColumn<CoverPerson, String> phoneColumn;
    @FXML
    private TableColumn<CoverPerson, String> emailColumn;
    @FXML
    private TableColumn<CoverPerson, Integer> domainsCountColumn;

    @FXML
    private void handleClickedAction(MouseEvent event) {
        if(event.getClickCount()==2){
            openDomainsStage();
            System.out.println("Инициирован показ данных о доменах ...");
        }
    }
    @FXML
    private void handleKeyPressedAction(KeyEvent event){
        if(event.getCode()==KeyCode.ENTER){
            openDomainsStage();
            System.out.println("Инициирован показ данных о доменах ...");
        }
    }
    private void openDomainsStage(){
        int idperson = table.getSelectionModel().getSelectedItem().getId();
        List<CoverDomain> domains = Repository.getDomains(idperson);
        new StageDomains().init(domains);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        List<CoverPerson> persons = Repository.getPersons();
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        jobtitleColumn.setCellValueFactory(new PropertyValueFactory<>("jobtitle"));
        firstnamelastnameColumn.setCellValueFactory(new PropertyValueFactory<>("firstnamelastname"));
        phoneColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        domainsCountColumn.setCellValueFactory(new PropertyValueFactory<>("domainsCount"));
        table.setItems(FXCollections.observableArrayList(persons));
    }
    
}
