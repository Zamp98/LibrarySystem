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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author arthu
 */
public class Tela_Login_Controller implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TextField userLogin;
    @FXML
    private PasswordField userPassword;
    @FXML
    private Button loginButton;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    ///O código a seguir é muito importante para trocar as janelas, não o altere muito
    @FXML
    private void loginButtonAction(ActionEvent event) throws IOException {
        Parent aux = FXMLLoader.load(getClass().getResource("Tela_Sistema.fxml"));
        Scene sistema = new Scene(aux);
        ///this line makes access to the main window
        Stage janela = (Stage)((Node)event.getSource()).getScene().getWindow();
        janela.setScene(sistema);
        janela.show();
    }
    
}
