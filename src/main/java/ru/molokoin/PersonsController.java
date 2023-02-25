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

public class PersonsController implements Initializable{
    @FXML
    private TableView<Person> table;
    @FXML
    private TableColumn<Person, Integer> idColumn;
    @FXML
    private TableColumn<Person, String> jobtitleColumn;
    @FXML
    private TableColumn<Person, String> firstnamelastnameColumn;
    @FXML
    private TableColumn<Person, String> phoneColumn;
    @FXML
    private TableColumn<Person, String> emailColumn;
    @FXML
    private TableColumn<Person, Integer> domainsCountColumn;

    @FXML
    private void handleClickedAction(MouseEvent event) {
        if(event.getClickCount()==2){
            //openEducationStage();
            System.out.println("Инициирован показ данных о доменах ...");
        }
    }
    @FXML
    private void handleKeyPressedAction(KeyEvent event){
        if(event.getCode()==KeyCode.ENTER){
            //openEducationStage();
            System.out.println("Инициирован показ данных о доменах ...");
        }
    }
    // private void openEducationStage(){
    //     Repository repository = new Repository();
    //         int idperson = table.getSelectionModel().getSelectedItem().getId();
    //         Person person = repository.findPersonById(idperson);
    //         new EducationStage().init(person);
    // }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'initialize'");
    }
    
}
