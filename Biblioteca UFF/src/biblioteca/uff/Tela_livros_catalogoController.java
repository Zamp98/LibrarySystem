/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.uff;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author arthu
 */
public class Tela_livros_catalogoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private List<String> livros = new ArrayList<>(); 
    private ObservableList<String> observableList;
    @FXML
    private AnchorPane bookAnchorPane;

    @FXML
    private ListView<String> bookList;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        carregaLista();
    }    
     @FXML
    private Button optionsButton;
    @FXML
    private Button infoButton;

    @FXML
    void infoButtonAction(ActionEvent event) throws IOException {
        AnchorPane info_screen = FXMLLoader.load(getClass().getResource("tela_livros_info.fxml"));
        String book = bookList.getAccessibleRole().toString();
    }
    @FXML
    void optionsButtonAction(ActionEvent event) throws IOException {
        AnchorPane op_screen = FXMLLoader.load(getClass().getResource("tela_livros_opcoes.fxml"));
        String book = bookList.getAccessibleRole().toString();
        
    }
    public void carregaLista(){
        livros.add("Livro 1");
        livros.add("Livro 2");
        livros.add("Livro 3");
        observableList = FXCollections.observableArrayList(livros);
        bookList.setItems(observableList);
    }
}
