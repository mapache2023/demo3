package demo;
import java.awt.*;
import java.util.Random;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button abreGrid;

    @FXML
    private Button abreIntefazs;

    @FXML
    private Button agregaB;

    @FXML
    private AnchorPane anchor;

    @FXML
    private GridPane hor_gr;

    @FXML
    private ChoiceBox<String> choiceDia;
    private String[] dias={"lunes","martes","miercoles","jueves","viernes"};
    @FXML
    private ChoiceBox<Integer> choiceHora;
    public Integer[] horas={7,8,9,10,11,12,13,14,15,16,17,18,19};
    @FXML
    private Label confirmacionLabel;

    @FXML
    private TextField nombreField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceDia.getItems().addAll(dias);
        choiceHora.getItems().addAll(horas);
    }


    public void abre_consultor_db(ActionEvent event)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/muestra_materia.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void agregar(ActionEvent event)throws IOException {


        System.out.println("agrega activado");
        String materia= nombreField.getText();
        int hora= choiceHora.getValue();
        String dia= choiceDia.getValue();

        String di=dia;
        int h=hora;
        int y= (hora-7)/2;
        int x = 0;

        switch (di)  {
            case "lunes":
                x=0;
                break;

            case "martes":
                x=1;
                break;
            case "miercoles":
                x=2;
                break;

            case "jueves":
                x=3;
                break;
            case "viernes":
                x=4;
                break;

        }
        Label label= new Label();
        hor_gr.add(label,x,y);
        nombreField.setText("");

    }
}
