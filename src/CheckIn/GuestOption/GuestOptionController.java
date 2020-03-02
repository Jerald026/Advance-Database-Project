/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckIn.GuestOption;

import com.jfoenix.controls.JFXButton;
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
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author halla
 */
public class GuestOptionController implements Initializable {

    @FXML
    private JFXButton BTN_NewGuest;
    @FXML
    private JFXButton BTN_OldGuest;
    @FXML
    private JFXButton BTN_ReservedGuest;
    @FXML
    private JFXButton BTN_ReservedGuest1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void NewGuest(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/CheckIn/CheckIn.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setTitle("Check-in");
        stage.setScene(scene);
        ((Node) event.getSource()).getScene().getWindow().hide();
        stage.show();
    }

    @FXML
    private void OldGuest(ActionEvent event) {
    }

    @FXML
    private void ReservedGuest(ActionEvent event) {
    }

    @FXML
    private void Back(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/Staff/Staff.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setTitle("Check-In");
        stage.setScene(scene);
        ((Node) event.getSource()).getScene().getWindow().hide();
        stage.show();
    }

}
