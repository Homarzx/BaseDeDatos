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
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
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
import javax.swing.JOptionPane;
import static tiendaonline.InicioSesionController.nomUsuario;
import static tiendaonline.InicioSesionController.pagina;
import static tiendaonline.InicioSesionController.tipoUser;

/**
 * FXML Controller class
 *
 * @author barce
 */
public class Screen2Controller implements Initializable {

    public static String tipoUsuarioString;

    private TreeSet<String> treeSet;

    @FXML
    private JFXButton iniSesionSegura;

    public void getButtonIniciar() {
        iniSesionSegura.setDisable(true);
    }

    @FXML
    private Label cuentayLista;

    public void getLabelCuentaLista() {
        cuentayLista.setDisable(false);
    }

    @FXML
    private Label labelvender;

    public void getLabelVender() {
        labelvender.setDisable(false);
    }

    @FXML
    private Label nombreUsuario;

    public void setNombreUsuario(String nombreUser) {
        nombreUsuario.setText(nombreUser);
    }

    @FXML
    private VBox vboxCuentaLista;

    @FXML
    void abrirsubMenu(MouseEvent event) {
        vboxCuentaLista.setVisible(true);
    }
    
    @FXML
    private TextField ubi_pais;
    
    @FXML
    private TextField ubi_ciudad;
    
    @FXML
    private TextField ubi_sector;
    
    @FXML
    private TextField ubi_calle;
    
    @FXML
    private TextField ubi_manzana;
    
    @FXML
    private TextField ubi_villa;
    
    @FXML
    private TextField ubi_codigoPostal;
    
    @FXML
    private TextField tar_numero;
    
    @FXML
    private TextField tar_fechExpiracion;
    
    @FXML
    private TextField tar_cvs;
    
    @FXML
    private ComboBox tar_tipoPago;
    
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
    private ScrollPane scrollPanelCompra;

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
    private JFXButton nueva_Ubicacion;
    
    @FXML
    private JFXButton agregar_Ubicacion;
    
    @FXML
    private JFXButton editar_Ubicacion;
    
    @FXML
    private JFXButton nueva_tarjeta;
    
    @FXML
    private JFXButton agregar_tarjeta;
    
    @FXML
    private JFXButton editar_tarjeta;

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

    @FXML
    private TextField textBuscar2;

    @FXML
    private TextField textBuscar3;

    @FXML
    private TextField textBuscar4;

    @FXML
    private TextField textBuscar5;
    
    @FXML
    private Label labelSubtotal;

    public void setLabelSubtotal(String subtotal) {
        this.labelSubtotal.setText(subtotal);
    }

    
    //private String txtProducto;
    
    HBox agregarAlcarrito;
    int conteo = -1;
    int cantidadProducto = 0;

    
    
    double precioProductosAcumulados = 0.0; 
    
    
    @FXML
    void eliminarTarjetaGuardada(ActionEvent event) {

    }

    @FXML
    void eliminarUbicacionGuardada(ActionEvent event) {

    }
    
    @FXML
    void BuscarProducto(MouseEvent event) {
        //llenarSet();
        //autoCompletar();
        vboxProductos.getChildren().clear();
        vboxProductos.setStyle("-fx-background-color:  white");
        Producto pro = new Producto();
        //vboxProductos
        //\\ImagenesProductos\\001.jpg
        try {
            String nombreUsuarioTexto = textBuscar.getText();
            vboxProductos.setSpacing(30);
            HBox contenerInfo = new HBox();
            contenerInfo.setSpacing(20.0);
            ImageView imagen = new ImageView();
            Image img = new Image(pro.DevolverNombreUsuario(retornarId(nombreUsuarioTexto)));
            imagen.setFitWidth(320);
            imagen.setPreserveRatio(true);
            imagen.setSmooth(true);
            imagen.setCache(true);
            imagen.setImage(img);
            contenerInfo.getChildren().add(imagen);

            String[] lista = retornarDescripcionesInfo(nombreUsuarioTexto);
            VBox miniVbox = new VBox();
            VBox miniVbox2 = new VBox();
            Label nom = new Label();
            Label precio = new Label();
            Label cantidad = new Label();
            
            Label nom2 = new Label();
            Label precio2 = new Label();
            Label cantidad2 = new Label();

            JFXButton boton = new JFXButton("Agregar al Carrito");
            boton.setFont(new javafx.scene.text.Font("Arial", 20));
            boton.setStyle("-fx-font-weight: bold");
            boton.setStyle("-fx-background-color:  yellow");
            boton.setCursor(Cursor.HAND);
            boton.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    System.out.println("AGREGA AL CARRITO");
                    agregarAlcarrito.setSpacing(20);
                    agregarAlcarrito.setPadding(new javafx.geometry.Insets(10, 10, 10, 10));
                    agregarAlcarrito.setAlignment(Pos.CENTER);
                    vBoxProductosCarrito.getChildren().add(agregarAlcarrito);
                    JOptionPane.showMessageDialog(null, "PRODUCTO AGREGADO AL CARRITO CON ÉXITO!");
                    lista[1] = String.valueOf(Integer.valueOf(lista[1]) - 1);
                    cantidadProducto +=1;
                    precioProductosAcumulados +=Double.valueOf(lista[0]);
                    conteo+=1;
                    labelSubtotal.setText("Subtotal ( "+cantidadProducto+" ) : $ "+String.format("%.2f", precioProductosAcumulados));
                }
            });
            
            JFXButton boton2 = new JFXButton("Eliminar del Carrito");
            boton2.setFont(new javafx.scene.text.Font("Arial", 20));
            boton2.setStyle("-fx-font-weight: bold");
            boton2.setStyle("-fx-background-color:  red");
            boton2.setCursor(Cursor.HAND);
            boton2.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    System.out.println("ELIMINADO DEL CARRITO");
                    vBoxProductosCarrito.getChildren().remove(conteo);
                    conteo-=1;
                    cantidadProducto -=1;
                    precioProductosAcumulados -=Double.valueOf(lista[0]);
                    lista[1] = String.valueOf(Integer.valueOf(lista[1]) - 1);
                    labelSubtotal.setText("Subtotal ( "+cantidadProducto+" ) : $ "+String.format("%.2f", precioProductosAcumulados));
                    //agregarAlcarrito.setSpacing(20);
                    //agregarAlcarrito.setPadding(new javafx.geometry.Insets(10, 10, 10, 10));
                    //agregarAlcarrito.setAlignment(Pos.CENTER);
                    //vBoxProductosCarrito.getChildren().add(agregarAlcarrito);
                }
            });

            nom.setText(nombreUsuarioTexto.toUpperCase());
            precio.setText("$ " + lista[0]);
            cantidad.setText("Stock: " + lista[1]);

            nom.setFont(new javafx.scene.text.Font("Arial", 24));
            nom.setStyle("-fx-font-weight: bold");
            precio.setFont(new javafx.scene.text.Font("Arial", 24));
            cantidad.setFont(new javafx.scene.text.Font("Arial", 18));

            miniVbox.getChildren().addAll(nom, precio, cantidad,boton);
            
            nom2.setText(nombreUsuarioTexto.toUpperCase());
            precio2.setText("$ " + lista[0]);
            cantidad2.setText("Stock: " + lista[1]);

            nom2.setFont(new javafx.scene.text.Font("Arial", 24));
            nom2.setStyle("-fx-font-weight: bold");
            precio2.setFont(new javafx.scene.text.Font("Arial", 24));
            cantidad2.setFont(new javafx.scene.text.Font("Arial", 18));

            miniVbox2.getChildren().addAll(nom2, precio2, cantidad2,boton2);
            
            agregarAlcarrito = new HBox();
            ImageView imagen2 = new ImageView();
            Image im = new Image(pro.DevolverNombreUsuario(retornarId(nombreUsuarioTexto)));
            imagen2.setFitWidth(320);
            imagen2.setPreserveRatio(true);
            imagen2.setSmooth(true);
            imagen2.setCache(true);
            imagen2.setImage(im);
            miniVbox2.setSpacing(10);
            agregarAlcarrito.getChildren().addAll(imagen2,miniVbox2);
            miniVbox.setSpacing(10);
            contenerInfo.setPadding(new javafx.geometry.Insets(10, 10, 10, 10));
            contenerInfo.setAlignment(Pos.CENTER);
            contenerInfo.getChildren().add(miniVbox);

            vboxProductos.getChildren().add(contenerInfo);

            scrollPanel2.setVisible(true);
            scrollPanel1.setVisible(false);
            scrollPanelCarrito.setVisible(false);
            scrollPanelCompra.setVisible(false);
            //llenarSet();
            //autoCompletar();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "INGRESE EL NOMBRE DE PRODUCTO PARA BUSCAR");
            //scrollPanel2.setVisible(true);
        }

    }

    public String retornarId(String nombre) {
        String id = "";

        for (int i = 0; i < listaIdProductos.size(); i++) {
            if (listaIdProductos.get(i)[0].equals(nombre)) {
                id = listaIdProductos.get(i)[1];
            }
        }

        return id;
    }

    public String[] retornarDescripcionesInfo(String nombre) {
        String[] descrip = new String[2];

        for (int i = 0; i < listaIdProductos.size(); i++) {
            if (listaIdProductos.get(i)[0].equals(nombre)) {
                descrip[0] = listaIdProductos.get(i)[2];
                descrip[1] = listaIdProductos.get(i)[3];

            }
        }

        return descrip;
    }
    
    @FXML
    private Label labelPrecioAcumulado;

    public void setLabelPrecioAcumulado(String labelPrecioAcumulado) {
        this.labelPrecioAcumulado.setText(labelPrecioAcumulado);
    }
    
    
    @FXML
    void procederAlPago(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InicioSesion.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            InicioSesionController ini = new InicioSesionController();
            ini = fxmlLoader.getController();
            ini.setPrecioCompra(String.valueOf(precioProductosAcumulados));
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            stage.show();
            InicioSesionController.pagina = stage;
            stageActual.close();
        } catch (Exception ex) {

        }
        
        
        scrollPanelCompra.setVisible(true);
        scrollPanel1.setVisible(false);
        scrollPanel2.setVisible(false);
        scrollPanelCarrito.setVisible(false);
        
        
        
       
    }
    
    @FXML
    private Label nombreUsuario2;

    public void setNombreUsuario2(String nombre) {
        this.nombreUsuario2.setText(nombre);
    }

    
    
    

    public ScrollPane getScrollPanelCompra() {
        return scrollPanelCompra;
    }

    public ScrollPane getScrollPanelCarrito() {
        return scrollPanelCarrito;
    }

    public ScrollPane getScrollPanel2() {
        return scrollPanel2;
    }

    public ScrollPane getScrollPanel1() {
        return scrollPanel1;
    }

    
    
    
    
    @FXML
    void pagPrincipal(MouseEvent event) {
        scrollPanel1.setVisible(true);
        scrollPanel2.setVisible(false);
        scrollPanelCarrito.setVisible(false);
        scrollPanelCompra.setVisible(false);
    }

    @FXML
    void accederAlCarrito(MouseEvent event) {
        scrollPanelCarrito.setVisible(true);
        scrollPanel1.setVisible(false);
        scrollPanel2.setVisible(false);
        scrollPanelCompra.setVisible(false);
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
    void abrirWishList(MouseEvent event) {

    }
    public static Stage iniciadoSesion;
    public static Stage stageActual;

    @FXML
    void cerrarSesion(MouseEvent event) {
        vboxCuentaLista.setVisible(false);
        iniSesionSegura.setDisable(false);

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Screen2.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Screen2Controller sc = fxmlLoader.getController();
            sc.setNombreUsuario("Hola, " + "identificate");
            Stage stage = new Stage();
            stage.setMaximized(true);
            stage.setScene(new Scene(root1));
            stage.show();
            iniciadoSesion.close();
            stageActual = stage;
        } catch (Exception ex) {
            System.out.println("ERROR FATAL");
        }
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

    @FXML
    void eliminarSubMenu(MouseEvent event) {
        vboxCuentaLista.setVisible(false);
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
    void iniciarSesionSeguro(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InicioSesion.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            stage.show();
            InicioSesionController.pagina = stage;
            stageActual.close();
        } catch (Exception ex) {

        }

    }

    /**
     * Metodo que llena combobox de la clase categoria
     */
    private void llenarComboBox() {
        ResultSet rs;
        Connection cn = null;
        try {
            Conexion con = new Conexion();
            cn = con.conectar();
            String sql = "SELECT * FROM CATEGORIA";
            PreparedStatement pst = cn.prepareCall(sql);
            System.out.println("1");
            rs = pst.executeQuery();
            rs.next();
            while (rs.isAfterLast() != true) {
                String t = rs.getString("nombre");
                departClick.getItems().add(t);
                System.out.println();
                System.out.println("cuidado");
                rs.next();
            }

        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public void autoCompletar() {
        textBuscar.setOnKeyReleased(new EventHandler() {
            @Override
            public void handle(Event event) {
                String to_check = textBuscar.getText();
                int to_check_len = to_check.length();
                for (String data : treeSet) {
                    String check_from_data = "";
                    for (int i = 0; i < to_check_len; i++) {
                        if (to_check_len <= data.length()) {
                            check_from_data = check_from_data + data.charAt(i);
                        }
                    }
                    if (check_from_data.equals(to_check) && !check_from_data.equals("")) {
                        textBuscar.setText(data);
                        //textBuscar.setSelectionStart(to_check_len);
                        //textBuscar.setSelectionEnd(data.length());
                        break;
                    }
                }
            }
        });

        textBuscar2.setOnKeyReleased(new EventHandler() {
            @Override
            public void handle(Event event) {
                String to_check = textBuscar2.getText();
                int to_check_len = to_check.length();
                for (String data : treeSet) {
                    String check_from_data = "";
                    for (int i = 0; i < to_check_len; i++) {
                        if (to_check_len <= data.length()) {
                            check_from_data = check_from_data + data.charAt(i);
                        }
                    }
                    if (check_from_data.equals(to_check) && !check_from_data.equals("")) {
                        textBuscar2.setText(data);
                        //textBuscar.setSelectionStart(to_check_len);
                        //textBuscar.setSelectionEnd(data.length());
                        break;
                    }
                }
            }
        });

    }
    ArrayList<String[]> listaIdProductos = new ArrayList<String[]>();

    private void llenarSet() {
        treeSet = new TreeSet();
        ResultSet rs;
        Connection cn = null;
        try {
            Conexion con = new Conexion();
            cn = con.conectar();
            String sql = "SELECT * FROM PRODUCTO";
            PreparedStatement pst = cn.prepareCall(sql);
            System.out.println("1");
            rs = pst.executeQuery();
            rs.next();
            while (rs.isAfterLast() != true) {
                String[] listaTemporal = new String[4];
                String t = rs.getString("nombre");
                listaTemporal[0] = t;
                listaTemporal[1] = rs.getString("idProducto");
                listaTemporal[2] = rs.getString("precio");
                listaTemporal[3] = rs.getString("cantidad");

                listaIdProductos.add(listaTemporal);
                treeSet.add(t);
                rs.next();
            }

        } catch (SQLException e) {
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
        departClick.setStyle("-fx-prompt-text-fill: white");
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
        System.out.println("Esto es: " + nombreUsuario.getText());
        cuentayLista.setDisable(true);
        labelvender.setDisable(true);
        vboxCuentaLista.setVisible(false);
        vBoxProductosCarrito.setStyle("-fx-background-color:  white");
        System.out.println(labelSubtotal.getText());
    }

}
