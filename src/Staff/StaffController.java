/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staff;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author halla
 */
public class StaffController implements Initializable {

    @FXML
    private AnchorPane Pane;

    @FXML
    private ImageView IV_logo;

    @FXML
    private PieChart chart, chart1;

    @FXML
    private JFXHamburger ham;

    @FXML
    private JFXButton BTN_CheckIn;

    @FXML
    private JFXButton BTN_RoomReservation;

    @FXML
    private JFXButton BTN_CheckOut;

    @FXML
    private JFXButton BTN_CancelReservation;

    @FXML
    private JFXButton BTN_Guests;

    @FXML
    private JFXButton BTN_Rooms;

    @FXML
    private JFXDrawer drawer;

    @FXML
    void CancelReservation(ActionEvent event) {

    }

    @FXML
    void CheckIn(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/CheckIn/GuestOption/GuestOption.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setTitle("Check-In");
        stage.setScene(scene);
        ((Node) event.getSource()).getScene().getWindow().hide();
        stage.show();
    }

    @FXML
    void CheckOut(ActionEvent event) {

    }

    @FXML
    void Guests(ActionEvent event) {

    }

    @FXML
    void RoomReservation(ActionEvent event) {

    }

    @FXML
    void Rooms(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Image logo = new Image("/Pics/logoTrans.png");
        IV_logo.setImage(logo);
        IV_logo.setFitHeight(150);
        IV_logo.setFitWidth(550);
        IV_logo.setPreserveRatio(true);

        ObservableList<PieChart.Data> pieChartData
                = FXCollections.observableArrayList(
                        new PieChart.Data("Available Room", 80),
                        new PieChart.Data("Occupied", 92));
        chart.setData(pieChartData);
        chart.setStartAngle(90);

        ObservableList<PieChart.Data> pieChartData1
                = FXCollections.observableArrayList(
                        new PieChart.Data("Reserved Room", 87),
                        new PieChart.Data("Vancant", 300));
        chart1.setData(pieChartData1);
        chart1.setStartAngle(90);

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
        try {
            VBox box = FXMLLoader.load(getClass().getResource("Drawer.fxml"));
            drawer.setSidePane(box);
            for (Node node : box.getChildren()) {
                if (node.getAccessibleText() != null) {
                    node.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
                        switch (node.getAccessibleText()) {
                            case "Cancel Booking":

                                break;
                            case "Rebooking":

                                break;
                            case "Login": {

                            }
                            break;
                            case "Exit":
                                System.exit(0);
                        }
                    });
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(StaffController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
