/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckIn;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
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
public class CheckInController implements Initializable {

    @FXML
    private JFXButton BTN_Back;

    @FXML
    private JFXButton BTN_Submit;

    @FXML
    private JFXButton BTN_Clear;
    
    @FXML
    private JFXTextField TF_LastName;

    @FXML
    private JFXTextField TF_FirstName;

    @FXML
    private JFXTextField TF_Email;

    @FXML
    private JFXTextField TF_Phone;

    @FXML
    private JFXTextField TF_Address;

    @FXML
    private JFXTextField TF_City;

    @FXML
    private JFXTextField TF_Nationality;

    @FXML
    void Back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/CheckIn/GuestOption/GuestOption.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setTitle("Check-in");
        stage.setScene(scene);
        ((Node) event.getSource()).getScene().getWindow().hide();
        stage.show();
    }

    @FXML
    void Clear(ActionEvent event) {
        TF_LastName.setText("");
        TF_FirstName.setText("");
        TF_Email.setText("");
        TF_Phone.setText("");
        TF_Address.setText("");
        TF_City.setText("");
        TF_Nationality.setText("");
    }

    @FXML
    void Submit(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/CheckIn/Submit/Submit.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setTitle("Check-In");
        stage.setScene(scene);
        ((Node) event.getSource()).getScene().getWindow().hide();
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    }

}
