/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaonline;

import Conectar.Conexion;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author barce
 */
public class Screen2Controller implements Initializable {
    
    private TreeSet<String> treeSet;

    //@FXML
    //private ScrollPane dezplazamiento;

    //@FXML
    //private AnchorPane panelDezplaMain;

      @FXML
    private StackPane stackPanel;

    @FXML
    private ScrollPane scrollPanelVendedor;

    @FXML
    private VBox vboxpanel2111;

    @FXML
    private ImageView btnBuscar1111;

    @FXML
    private JFXComboBox<?> departClick1111;

    @FXML
    private Label enviarUbicacion1111;

    @FXML
    private VBox btnIdentificate1111;

    @FXML
    private Label btnPedidos1111;

    @FXML
    private Label btnCarrito1111;

    @FXML
    private VBox vboxProductos111;

    @FXML
    private AnchorPane panelBotton1111;

    @FXML
    private JFXButton botonInicio1111;

    @FXML
    private ScrollPane scrollPanelWishList;

    @FXML
    private VBox vboxpanel211;

    @FXML
    private ImageView btnBuscar111;

    @FXML
    private JFXComboBox<?> departClick111;

    @FXML
    private Label enviarUbicacion111;

    @FXML
    private VBox btnIdentificate111;

    @FXML
    private Label btnPedidos111;

    @FXML
    private Label btnCarrito111;

    @FXML
    private VBox vboxProductos11;

    @FXML
    private AnchorPane panelBotton111;

    @FXML
    private JFXButton botonInicio111;

    @FXML
    private ScrollPane scrollPanelCarrito;

    @FXML
    private VBox vboxpanel21;

    @FXML
    private ImageView btnBuscar11;

    @FXML
    private JFXComboBox<?> departClick11;

    @FXML
    private Label enviarUbicacion11;

    @FXML
    private VBox btnIdentificate11;

    @FXML
    private Label btnPedidos11;

    @FXML
    private Label btnCarrito11;

    @FXML
    private VBox vboxProductos1;

    @FXML
    private VBox vBoxProductosCarrito;

    @FXML
    private AnchorPane panelBotton11;

    @FXML
    private JFXButton botonInicio11;

    @FXML
    private ScrollPane scrollPanel2;

    @FXML
    private VBox vboxpanel2;

    @FXML
    private ImageView btnBuscar1;

    @FXML
    private JFXComboBox<?> departClick1;

    @FXML
    private Label enviarUbicacion1;

    @FXML
    private VBox btnIdentificate1;

    @FXML
    private Label btnPedidos1;

    @FXML
    private Label btnCarrito1;

    @FXML
    private VBox vboxProductos;

    @FXML
    private AnchorPane panelBotton1;

    @FXML
    private JFXButton botonInicio1;

    @FXML
    private ScrollPane scrollPanel1;

    @FXML
    private VBox vboxpanel1;

    @FXML
    private ImageView btnBuscar;

    @FXML
    private JFXComboBox<String> departClick;

    @FXML
    private Label enviarUbicacion;

    @FXML
    private VBox btnIdentificate;

    @FXML
    private Label btnPedidos;

    @FXML
    private Label btnCarrito;

    @FXML
    private VBox panelBody;

    @FXML
    private ImageView imgPortada;

    @FXML
    private JFXButton iniSesionSegura;

    @FXML
    private ImageView btnBodyIzq;

    @FXML
    private ImageView btnBodyDer;

    @FXML
    private ImageView imagenPublicidad;

    @FXML
    private Label textPublicidad;

    @FXML
    private ImageView izqHbox1;

    @FXML
    private Label textpubli1;

    @FXML
    private ImageView derHbox1;

    @FXML
    private ScrollPane scrollHbox0;

    @FXML
    private HBox hboxfila0;

    @FXML
    private ImageView izqHbox2;

    @FXML
    private Label textpubli2;

    @FXML
    private ImageView derHbox2;

    @FXML
    private ScrollPane scrollHbox1;

    @FXML
    private HBox hboxfila1;

    @FXML
    private AnchorPane panelBotton;

    @FXML
    private JFXButton botonInicio;
    
    @FXML
    private TextField textBuscar;
     
    
     
    private String txtProducto;


    @FXML
    void BuscarProducto(MouseEvent event) {
        
        txtProducto =  textBuscar.getText();
        scrollPanel2.setVisible(true);
        scrollPanel1.setVisible(false);
        scrollPanelCarrito.setVisible(false);
    }
    
    @FXML
    void pagPrincipal(MouseEvent event) {
        scrollPanel1.setVisible(true);
        scrollPanel2.setVisible(false);
        scrollPanelCarrito.setVisible(false);
    }

    @FXML
    void accederAlCarrito(MouseEvent event) {
        scrollPanelCarrito.setVisible(true);
        scrollPanel1.setVisible(false);
        scrollPanel2.setVisible(false);
    }

    @FXML
    void iniciarSesion(ActionEvent event) {

    }

    @FXML
    void verPedidos(MouseEvent event) {

    }

    int cont = 0;

    String[] listaVector = {"Compra millones de productos desde cualquier parte del mundo", "Los mejores precios, los encuentras solo aquí", "Descuentos durante todo el año", "Has crecer tu negocio y vende por FastBuy"};

    @FXML
    void cambiarPortada(MouseEvent event) {

        if ((cont < 3) && (cont >= 0)) {
            cont += 1;
            imgPortada.setImage(new Image("\\Recursos_Graficos\\pr" + cont + ".png"));
            imagenPublicidad.setImage(new Image("\\Recursos_Graficos\\ip" + cont + ".png"));
            textPublicidad.setText(listaVector[cont]);
        } else if (cont == (listaVector.length - 1)) {
            cont = 0;
            imgPortada.setImage(new Image("\\Recursos_Graficos\\pr" + cont + ".png"));
            imagenPublicidad.setImage(new Image("\\Recursos_Graficos\\ip" + cont + ".png"));
            textPublicidad.setText(listaVector[cont]);

        }

    }

    double hboxcont0 = 0;

    @FXML
    void dermoverHbox0(MouseEvent event) {
        if (hboxcont0 == 1.0) {
            hboxcont0 = 1.0;
        } else {
            hboxcont0 += 0.25;
            scrollHbox0.setHvalue(hboxcont0);
        }

    }

    @FXML
    void izqmoverHbox0(MouseEvent event) {
        if (hboxcont0 == 0.0) {
            hboxcont0 = 0;
        } else {
            hboxcont0 -= 0.25;
            scrollHbox0.setHvalue(hboxcont0);
        }

    }

    double hboxcont1 = 0;

    @FXML
    void dermoverHbox1(MouseEvent event) {
        if (hboxcont1 == 1.0) {
            hboxcont1 = 1.0;
        } else {
            hboxcont1 += 0.25;
            scrollHbox1.setHvalue(hboxcont1);
        }

    }

    @FXML
    void izqmoverHbox1(MouseEvent event) {
        if (hboxcont1 == 0.0) {
            hboxcont1 = 0;
        } else {
            hboxcont1 -= 0.25;
            scrollHbox1.setHvalue(hboxcont1);
        }

    }

    int cont2 = 4;

    @FXML
    void cambiarPortadaIzq(MouseEvent event) {

        if ((cont <= 3) && (cont > 0)) {
            cont -= 1;
            imgPortada.setImage(new Image("\\Recursos_Graficos\\pr" + (cont) + ".png"));
            imagenPublicidad.setImage(new Image("\\Recursos_Graficos\\ip" + (cont) + ".png"));
            textPublicidad.setText(listaVector[cont]);

        } else if (cont == 0) {
            cont = listaVector.length - 1;
            imgPortada.setImage(new Image("\\Recursos_Graficos\\pr" + cont + ".png"));
            imagenPublicidad.setImage(new Image("\\Recursos_Graficos\\ip" + cont + ".png"));
            textPublicidad.setText(listaVector[cont]);

        }

    }

    @FXML
    void envioUbicacion(MouseEvent event) {

    }

    @FXML
    void irInicioPagina(ActionEvent event) {
        scrollPanel1.setVvalue(0);
        scrollPanel2.setVvalue(0);
    }

    @FXML
    void cambiandoOpacidad(MouseEvent event) {
        panelBody.setOpacity(0.5);
        vboxProductos.setOpacity(0.5);
        vboxpanel1.setStyle("-fx-background-color: black");
        vboxpanel2.setStyle("-fx-background-color: black");
        departClick.show();

    }

    @FXML
    void restaurarOpacidad(MouseEvent event) {

        panelBody.setOpacity(1);
        vboxProductos.setOpacity(1);
        vboxpanel1.setStyle("-fx-background-color:  #eaecee");
        vboxpanel2.setStyle("-fx-background-color:  #17202A");
        departClick.hide();

    }

    public void llenarHbox(String nombreImagen) {
        Image img = new Image("\\Recursos_Graficos\\p" + nombreImagen + ".png");
        Image img2 = new Image("\\Recursos_Graficos\\c" + nombreImagen + ".png");
        ImageView imgCont = new ImageView(img);
        ImageView imgCont2 = new ImageView(img2);
        AnchorPane panelAdd = new AnchorPane();
        AnchorPane panelAdd2 = new AnchorPane();
        panelAdd.getChildren().add(imgCont);
        panelAdd2.getChildren().add(imgCont2);
        hboxfila0.getChildren().add(panelAdd);
        hboxfila1.getChildren().add(panelAdd2);
    }

    @FXML
    void iniciarSesionSeguro(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InicioSesion.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ex) {

        }

    } /**
     * Metodo que llena combobox de la clase categoria
     */
    private void llenarComboBox(){
        ResultSet rs;
        Connection cn = null;
        try{
            Conexion con =  new Conexion();
            cn = con.conectar();
            String sql = "SELECT * FROM CATEGORIA";
            PreparedStatement pst = cn.prepareCall(sql);
            System.out.println("1");
            rs = pst.executeQuery();
            rs.next();
            while(rs.isAfterLast()!= true){
                String t = rs.getString("nombre");
                departClick.getItems().add(t);
                System.out.println();
                System.out.println("cuidado");
                rs.next();
            }

        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    
    public void autoCompletar(){
    textBuscar.setOnKeyReleased(new EventHandler() {
        @Override
        public void handle(Event event) {
            String to_check=textBuscar.getText();
            int to_check_len=to_check.length();
            for(String data:treeSet)
            {
                String check_from_data="";
                for(int i=0;i<to_check_len;i++)
                {
                    if(to_check_len<=data.length())
                    {
                        check_from_data = check_from_data+data.charAt(i);
                    }
                }
                if(check_from_data.equals(to_check) && !check_from_data.equals(""))
                {
                    textBuscar.setText(data);
                    //textBuscar.setSelectionStart(to_check_len);
                    //textBuscar.setSelectionEnd(data.length());
                    break;
                }
            }
        }
    });

    }
    private void llenarSet(){
        treeSet= new TreeSet();
        ResultSet rs;
        Connection cn = null;
        try{
            Conexion con =  new Conexion();
            cn = con.conectar();
            String sql = "SELECT * FROM PRODUCTO";
            PreparedStatement pst = cn.prepareCall(sql);
            System.out.println("1");
            rs = pst.executeQuery();
            rs.next();
            while(rs.isAfterLast()!= true){
                String t = rs.getString("nombre");
                treeSet.add(t);
                rs.next();
            }

        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    public void BuscarProductoCat() {

        scrollPanel2.setVisible(true);
        scrollPanel1.setVisible(false);
        scrollPanelCarrito.setVisible(false);
    }
    
    @FXML
    void seleccionarItem(ActionEvent event) {
         System.out.println(departClick.getSelectionModel().getSelectedItem());
         BuscarProductoCat();
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        imgPortada.setImage(new Image("\\Recursos_Graficos\\pr" + cont + ".png"));
        imagenPublicidad.setImage(new Image("\\Recursos_Graficos\\ip" + cont + ".png"));
        textPublicidad.setText(listaVector[cont]);
        for (int i = 0; i < 11; i++) {
            llenarHbox(String.valueOf(i));
        }
        llenarComboBox();
        llenarSet();
        autoCompletar();

    }

}
