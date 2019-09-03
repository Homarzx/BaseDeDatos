/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaonline;

import Conectar.Conexion;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author barce
 */
public class FXMLDocumentController implements Initializable, DraggedScene {
    
    @FXML
    private JFXButton botonIniciarSesion;

    @FXML
    private AnchorPane container;

    @FXML
    private Button b_cerrar;

    @FXML
    private Button b_min;

    @FXML
    private Button crearCuenta;

    @FXML
    private AnchorPane panel1;

    @FXML
    private AnchorPane panel2;

    @FXML
    private AnchorPane panel3;

    @FXML
    private AnchorPane panel4;

    @FXML
    private Hyperlink regresar;
    
    @FXML
    private void AccionCerrar(ActionEvent event) {
        Stage stage = (Stage) container.getScene().getWindow();
        TiendaOnline.firtstage.show();
        stage.close();
    }

    @FXML
    private void AccionMinimizar(ActionEvent event) {
        Stage stage = (Stage) container.getScene().getWindow();
        stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    private void abrirPanelCrearCuenta(ActionEvent event) {
        fadeout(panel1);
        fadein(panel2);

    }

    @FXML
    private void abrirPanelCrearCuentaComprador(ActionEvent event) {
        fadeout(panel2);
        fadein(panel3);
    }

    @FXML
    private void abrirPanelCrearCuentaVendedor(ActionEvent event) {
        fadeout(panel2);
        fadein(panel4);
    }

    @FXML
    private void regresarPanel1(ActionEvent event) {
        fadeout(panel2);
        fadein(panel1);
    }

    @FXML
    private void regresarPanel2(ActionEvent event) {
        fadeout(panel3);
        fadeout(panel4);
        fadein(panel2);
    }

    private void fadeout(AnchorPane panel) {
        FadeTransition fade = new FadeTransition();
        fade.setDuration(Duration.millis(700));
        fade.setNode(panel);
        fade.setFromValue(1);
        fade.setToValue(0);
        fade.play();
        panel.setVisible(false);
    }

    private void fadein(AnchorPane panel) {
        panel.setVisible(true);
        FadeTransition fade = new FadeTransition();
        fade.setDuration(Duration.millis(700));
        fade.setNode(panel);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();
    }
    
    private void verificarDatos(){
        String correo;
        String password;
        ResultSet rs;
        Connection cn = null;
        try{
            Conexion con =  new Conexion();
            cn = con.conectar();
            String sql = "";
            PreparedStatement pst = cn.prepareCall(sql);
            rs = pst.executeQuery();
            rs.next();
            while(rs.isAfterLast()!= true){
                String t = rs.getString("nombre");
                rs.next();
            }

        }
        catch(SQLException e){
            System.err.println(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TiendaOnline.firtstage.close();
        this.onDraggedScene(this.container);
    }

}
