/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckIn.Submit.FindRoom.Confirmation;

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
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author halla
 */
public class ConfirmationController implements Initializable {

    @FXML
    private JFXButton BTN_Save;

    @FXML
    private JFXButton BTN_Back;
    @FXML
    private SplitPane splitPane;
    @FXML
    private JFXButton BTN_Validate;
    @FXML
    private JFXTextField TF_LastName;
    @FXML
    private JFXTextField TF_FirstName;
    @FXML
    private JFXTextField TF_Email;
    @FXML
    private JFXTextField TF_PhoneNum;
    @FXML
    private JFXTextField TF_Address;
    @FXML
    private JFXTextField TF_City;
    @FXML
    private JFXTextField TF_Nationality;
    @FXML
    private Label RoomType_Lbl;
    @FXML
    private Label NumOfBed_Lbl;
    @FXML
    private Label CheckInDate_Lbl;
    @FXML
    private Label CheckOut_Lbl;
    @FXML
    private Label RoomNum_Lbl;

    @FXML
    void Back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/CheckIn/Submit/FindRoom/FindRoom.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setTitle("Check-In");
        stage.setScene(scene);
        ((Node) event.getSource()).getScene().getWindow().hide();
        stage.show();
    }

    @FXML
    void Save(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Staff/Staff.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setTitle("Check-In");
        stage.setScene(scene);
        ((Node) event.getSource()).getScene().getWindow().hide();
        stage.show();
    }

    @FXML
    private void Validate(ActionEvent event) {
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
