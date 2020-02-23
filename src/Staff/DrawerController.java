/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staff;

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
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author halla
 */
public class DrawerController implements Initializable {

    @FXML
    private Button BTN_AddUser;

    @FXML
    private Button BTN_DeleteUser;

    @FXML
    private Button BTN_ViewUser;

    @FXML
    private Button BTN_Logout;

    @FXML
    void AddUser(ActionEvent event) {
        System.out.println("IM HERE AT ADD USER");
    }

    @FXML
    void DeleteUser(ActionEvent event) {
        System.out.println("IM HERE AT DELETE USER");
    }

    @FXML
    void ViewUser(ActionEvent event) {
        System.out.println("IM HERE AT VIEW USER");
    }

    @FXML
    void Logout(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/Login/Login.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setTitle("Login");
        stage.setScene(scene);
        ((Node) event.getSource()).getScene().getWindow().hide();
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
