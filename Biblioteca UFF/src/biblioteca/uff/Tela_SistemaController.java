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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author arthu
 */
public class Tela_SistemaController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Label greetingsLabel;
    @FXML
    private AnchorPane systemAnchorPane;

    @FXML
    private Button bookButton;

    @FXML
    private Button usersButton;

    @FXML
    private Button helpButton;

    @FXML
    private Button logoutButton;

    @FXML
    void bookButtonAction(ActionEvent event) throws IOException {
        
        this.systemAnchorPane.getChildren().clear();
        this.systemAnchorPane.getChildren().addAll((AnchorPane)FXMLLoader.load(getClass().getResource("tela_livros.fxml")));
    }

    @FXML
    void helpButtonAction(ActionEvent event) throws IOException {
        this.systemAnchorPane.getChildren().removeAll((Node)greetingsLabel);
        this.systemAnchorPane.getChildren().addAll((AnchorPane)FXMLLoader.load(getClass().getResource("tela_ajuda.fxml")));
    }

    @FXML
    void logoutButtonAction(ActionEvent event) throws IOException {
        Parent aux = FXMLLoader.load(getClass().getResource("tela_login.fxml"));
        Scene sistema = new Scene(aux);
        ///this line makes access to the main window
        Stage janela = (Stage)((Node)event.getSource()).getScene().getWindow();
        janela.setScene(sistema);
        janela.show();
    }
    

    @FXML
    void usersButtonAction(ActionEvent event) throws IOException {
        this.systemAnchorPane.getChildren().clear();
        this.systemAnchorPane.getChildren().addAll((AnchorPane)FXMLLoader.load(getClass().getResource("tela_usuario.fxml")));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
