/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckIn.Submit.FindRoom;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author halla
 */
public class FindRoomController implements Initializable {

    // comment
    @FXML
    private JFXTreeTableView<Rooms> TTV_RoomTables;

    @FXML
    private JFXButton BTN_CheckIn;

    @FXML
    private JFXButton BTN_Back;

    @FXML
    void Back(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/CheckIn/Submit/Submit.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setTitle("Check-In");
        stage.setScene(scene);
        ((Node) event.getSource()).getScene().getWindow().hide();
        stage.show();
    }

    @FXML
    void CheckIn(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/CheckIn/Submit/FindRoom/Confirmation/Confirmation.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setTitle("Check-In");
        stage.setScene(scene);
        ((Node) event.getSource()).getScene().getWindow().hide();
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        JFXTreeTableColumn<Rooms, String> deptCol = new JFXTreeTableColumn<>("Department");
        deptCol.setPrefWidth(150);
        deptCol.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Rooms, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<Rooms, String> param) {
                return param.getValue().getValue().department;
            }
        });

        JFXTreeTableColumn<Rooms, String> ageCol = new JFXTreeTableColumn<>("Age");
        ageCol.setPrefWidth(150);
        ageCol.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Rooms, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<Rooms, String> param) {
                return param.getValue().getValue().age;
            }
        });

        JFXTreeTableColumn<Rooms, String> nameCol = new JFXTreeTableColumn<>("Name");
        nameCol.setPrefWidth(150);
        nameCol.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Rooms, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<Rooms, String> param) {
                return param.getValue().getValue().userName;
            }
        });

        ObservableList<Rooms> rooms = FXCollections.observableArrayList();
        rooms.add(new Rooms("Jerald", "19", "IT Department"));
        rooms.add(new Rooms("Tayag", "12", "HR Department"));
        rooms.add(new Rooms("Hallado", "32", "LAW Department"));
        rooms.add(new Rooms("Cerceas", "42", "HRM Department"));
        rooms.add(new Rooms("Bulawan", "32", "CS Department"));
        rooms.add(new Rooms("Arias", "43", "LOL Department"));
        rooms.add(new Rooms("Benson", "13", "WEW Department"));
        rooms.add(new Rooms("Ronald", "14", "WASW Department"));
        rooms.add(new Rooms("Aldie", "53", "LOS Department"));
        rooms.add(new Rooms("Fondis", "32", "LAWSA Department"));
        rooms.add(new Rooms("Boomy", "54", "NEGRO Department"));
        rooms.add(new Rooms("Joshua", "21", "ASD Department"));
        rooms.add(new Rooms("Nawalub", "42", "LAGS Department"));
        rooms.add(new Rooms("Anatiram", "62", "JOSA Department"));
        rooms.add(new Rooms("Yalyalut", "24", "RATBU Department"));
        rooms.add(new Rooms("Etak", "52", "WELS Department"));
        rooms.add(new Rooms("Ngit", "55", "JASDW Department"));

        final TreeItem<Rooms> root = new RecursiveTreeItem<>(rooms, RecursiveTreeObject::getChildren);

        TTV_RoomTables.getColumns().setAll(nameCol, ageCol, deptCol);
        TTV_RoomTables.setRoot(root);
        TTV_RoomTables.setShowRoot(false);

    }

    class Rooms extends RecursiveTreeObject<Rooms> {

        StringProperty userName;
        StringProperty age;
        StringProperty department;

        public Rooms(String userName, String age, String department) {
            this.userName = new SimpleStringProperty(userName);
            this.age = new SimpleStringProperty(age);
            this.department = new SimpleStringProperty(department);
        }
    }
}
