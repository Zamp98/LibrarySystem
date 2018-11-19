/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.uff;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author arthu
 */
public class Tela_livrosController implements Initializable {

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
     @FXML
    private AnchorPane bookAnchorPane;

    @FXML
    private Button simpleSearchBookButton;

    @FXML
    private Button showCatalogue;

    @FXML
    private Button advancedSearchButton;

    @FXML
    private Button manageButton;

    @FXML
    void advancedSearchButtonAction(ActionEvent event) {
        ///TODO search by genre, name, year, author, quantity or code;
    }

    @FXML
    void manageButtonAction(ActionEvent event) {
        ///TODO add, erase or rent books
    }

    @FXML
    void showCatalogueButtonAction(ActionEvent event) throws IOException {
        ///TODO search and show all elements(sorted) from the book database
        bookAnchorPane.getChildren().clear();
        AnchorPane aux = (AnchorPane)FXMLLoader.load(getClass().getResource("tela_livros_catalogo.fxml"));
        //ListView<?> bookList = ;
        bookAnchorPane.getChildren().addAll(aux);
    }

    @FXML
    void simpleSearchButtonAction(ActionEvent event) throws IOException {
        ///TODO search by name
        bookAnchorPane.getChildren().clear();
        AnchorPane aux = (AnchorPane)FXMLLoader.load(getClass().getResource("tela_livros_busca_simples.fxml"));
        //ListView<?> bookList = ;
        bookAnchorPane.getChildren().addAll(aux);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
