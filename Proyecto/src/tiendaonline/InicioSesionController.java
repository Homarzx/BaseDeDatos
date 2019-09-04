/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaonline;

import Conectar.Conexion;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import javax.swing.JOptionPane;

/**
 *
 * @author barce
 */
public class InicioSesionController implements Initializable, DraggedScene {

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
    private JFXButton crearCuenta1;

    @FXML
    private JFXButton crearCuenta11;

    @FXML
    private JFXTextField c_cedula;

    @FXML
    private JFXTextField c_nombres;

    @FXML
    private JFXTextField c_apellidos;

    @FXML
    private JFXTextField c_edad;

    @FXML
    private JFXTextField c_telefono;

    @FXML
    private JFXTextField c_correo;

    @FXML
    private JFXPasswordField c_contraseña;

    @FXML
    private JFXPasswordField c_repetirContraseña;

    @FXML
    private JFXButton crearCuenta111;

    @FXML
    private Hyperlink regresar1;

    @FXML
    private JFXTextField v_cedula;

    @FXML
    private JFXTextField v_nombres;

    @FXML
    private JFXTextField v_apellidos;

    @FXML
    private JFXTextField v_nomTienda;

    @FXML
    private JFXTextField v_telefono;

    @FXML
    private JFXTextField v_correo;

    @FXML
    private JFXPasswordField v_contraseña;

    @FXML
    private JFXPasswordField v_repetircontraseña;

    @FXML
    private JFXTextField v_ruc;

    @FXML
    private JFXTextField validarCorreo;

    @FXML
    private JFXPasswordField validarContraseña;

    public static String tipoUser;
    public static String nomUsuario;

    @FXML
    void registrarComprador(ActionEvent event) {
        if (c_contraseña.getText().equals(c_repetirContraseña)) {
            Usuario user = new Usuario();
            user.RegistrarUsuarioComprador(c_cedula, c_nombres, c_apellidos, tipoUser, c_edad, c_telefono, c_correo, c_contraseña);
        }

    }

    @FXML
    void registrarVendedor(ActionEvent event) {
        if (v_contraseña.getText().equals(v_repetircontraseña)) {
            Usuario user = new Usuario();
            user.RegistrarUsuarioVendedor(v_cedula, v_nombres, v_apellidos, tipoUser, v_nomTienda, v_telefono, v_ruc, v_correo, v_contraseña);
        }
    }

    public static Stage pagina;

    @FXML
    void iniciarSesionAcceso(ActionEvent event) {
        Usuario user = new Usuario();
        String[] lista = user.ComprobarCuenta(validarCorreo);

        if (lista[2].equals("1")) {

            if (lista[0].equals(validarContraseña.getText())) {

                tipoUser = lista[1];

                nomUsuario = user.DevolverNombreUsuario(lista[3]);
                System.out.println(nomUsuario);
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Screen2.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    Screen2Controller sc = fxmlLoader.getController();
                    sc.setNombreUsuario("Hola, " + nomUsuario);
                    sc.getButtonIniciar();
                    sc.getLabelCuentaLista();
                    if (tipoUser.equals("V")) {
                        sc.getLabelVender();
                    }
                    Stage stage = new Stage();
                    stage.setMaximized(true);
                    stage.setScene(new Scene(root1));
                    stage.show();
                    Screen2Controller.iniciadoSesion = stage;
                    pagina.close();
                } catch (Exception ex) {
                    System.out.println("ERROR FATAL");
                }
            } else {
                JOptionPane.showMessageDialog(null, "CONTRASEÑA INCORRECTA");
            }
        } else if (lista[2].equals('0')) {
            JOptionPane.showMessageDialog(null, "USUARIO NO REGISTRADO");
        }

    }

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

    private void verificarDatos() {
        String correo;
        String password;
        ResultSet rs;
        Connection cn = null;
        try {
            Conexion con = new Conexion();
            cn = con.conectar();
            String sql = "";
            PreparedStatement pst = cn.prepareCall(sql);
            rs = pst.executeQuery();
            rs.next();
            while (rs.isAfterLast() != true) {
                String t = rs.getString("nombre");
                rs.next();
            }

        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TiendaOnline.firtstage.close();
        this.onDraggedScene(this.container);
    }

}
