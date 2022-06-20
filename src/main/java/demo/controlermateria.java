package demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import modelo.Data_helper;
import modelo.Materia;

import java.net.URL;
import java.util.ResourceBundle;

public class controlermateria implements Initializable {

    @FXML
    private ChoiceBox<String> choice_materia;
    String[] opciones={"BASES DE DATOS AVANZADAS","PROGRAMACION AVANZADA","REDES","ESTRUCTURAS DE DATOS","ORGANIZACION DE COMPUTADORAS"};
    @FXML
    private Label cosultaL;

    @FXML
    private Button cosultarB;

    @FXML
    private Label welcomeText;

    @FXML
    void consultardb(ActionEvent event) {
    String nombre=choice_materia.getValue();
        Data_helper data_helper= new Data_helper();
    Materia materia=data_helper.materiaxnombre(nombre);
    welcomeText.setText(materia.toString());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choice_materia.getItems().addAll(opciones);
    }
}