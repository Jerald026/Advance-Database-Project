/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author halla
 */
public class LoginController implements Initializable {

    @FXML
    private JFXTextField TF_Username;

    @FXML
    private JFXPasswordField PF_Password;

    @FXML
    private JFXButton Login;

    @FXML
    private JFXButton Back;

    @FXML
    private ImageView IV_Logo;

    @FXML
    void Back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/AdvanceDatabase/MainFxml.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setTitle("Main");
        stage.setScene(scene);
        ((Node) event.getSource()).getScene().getWindow().hide();
        stage.show();
    }

    @FXML
    void Login(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Staff/Staff.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setTitle("Staff");
        stage.setScene(scene);
        ((Node) event.getSource()).getScene().getWindow().hide();
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        RequiredFieldValidator validator = new RequiredFieldValidator();
        RequiredFieldValidator validator1 = new RequiredFieldValidator();

        TF_Username.getValidators().add(validator);
        validator.setMessage("Fill-up username!");

        TF_Username.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (!newValue) {
                    TF_Username.validate();
                }
            }
        });

        PF_Password.getValidators().add(validator1);
        validator1.setMessage("Fill-up password!");

        PF_Password.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (!newValue) {
                    PF_Password.validate();
                }
            }
        });
        
        Image logo = new Image("/Pics/logoTrans.png");
        IV_Logo.setImage(logo);
        IV_Logo.setFitHeight(150);
        IV_Logo.setFitWidth(550);
        IV_Logo.setPreserveRatio(true);
    }

}
