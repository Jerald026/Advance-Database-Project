/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvanceDatabase;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author halla
 */
public class MainController implements Initializable {

    @FXML
    private AnchorPane anchor;

    @FXML
    private JFXHamburger ham;

    @FXML
    private JFXDrawer drawer;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        try {
            HamburgerBackArrowBasicTransition burger = new HamburgerBackArrowBasicTransition(ham);
            burger.setRate(-1);
            ham.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) -> {
                burger.setRate(burger.getRate() * -1);
                burger.play();
                if (drawer.isOpened()) {
                    drawer.close();
                } else {
                    drawer.open();
                }
            });

            VBox box = FXMLLoader.load(getClass().getResource("Drawer.fxml"));
            drawer.setSidePane(box);
            for (Node node : box.getChildren()) {
                if (node.getAccessibleText() != null) {
                    node.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
                        switch (node.getAccessibleText()) {
                            case "Cancel Booking":
                                CancelBooking();
                                break;
                            case "Rebooking":
                                Rebooking();
                                break;
                            case "Login":
                        {
                            try {
                                Login();
                            } catch (IOException ex) {
                                System.err.println("ERROR!\n" + ex.getMessage());
                            }
                        }
                                break;
                            case "Exit":
                                System.exit(0);
                        }
                    });
                }
            }

        } catch (IOException ex) {
            
        }
    }
    
        private void Login() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/Login/Login.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
        Stage stage1 = (Stage) anchor.getScene().getWindow();
        stage1.hide();
    }

    private void CancelBooking() {

    }

    private void Rebooking() {

    }

}
