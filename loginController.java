/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1d;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

/**
 *
 * @author acer
 */
public class loginController implements Initializable {
    
    ;

    @FXML
    private Label idField;
    @FXML
    private PasswordField passowordField;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

     @FXML
    private void handleSigninAction(ActionEvent event) {
        String username = idField.getText();
        String password = passowordField.getText();
        
        if (username.equals("admin") && password.equals("test")) {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("Manager.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage = Main.getMainStage();
        stage.setScene(scene);
        stage.show();
            } catch (Exception e) {
                //EmptyLabel.setText("username or password is incorrect");
        }
    }
    
}
}
