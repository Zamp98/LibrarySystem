/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.uff;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author arthu
 */
public class Tela_livros_busca_simplesController implements Initializable {

    @FXML
    private Label searchStatusLabel;
    @FXML
    private AnchorPane bookAnchorPane;

    @FXML
    private TextField searchTextField;

    @FXML
    private Button searchButton;

    @FXML
    void simpleSearch(ActionEvent event) throws UnsupportedEncodingException {
        String bookName = this.searchTextField.getText();
        /*TODO search method with the database using this string. the function 
          should return the number of found elements.
        */
        int nFound = 0;//should call the book search method
        String aux = nFound+" book(s) found";
        this.searchStatusLabel.setText(aux);
    }
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
