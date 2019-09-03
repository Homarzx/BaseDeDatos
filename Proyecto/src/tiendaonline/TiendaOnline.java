/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaonline;

import Conectar.Conexion;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author barce
 */
public class TiendaOnline extends Application {

    public static Stage firtstage;
    public static String servidor = "";
    public static String puerto = "";
    public static String usua = "";
    public static String clav = "";
    
    @Override
    public void start(Stage stage) throws Exception {
        File datosDB = new File("\\InfoDB\\datosdb.txt");
        if (datosDB.exists()) {
            Scanner scanner;
            try {
                //se pasa el flujo al objeto scanner
                scanner = new Scanner(datosDB);
                while (scanner.hasNextLine()) {
                    // el objeto scanner lee linea a linea desde el archivo
                    String linea = scanner.nextLine();
                    Scanner delimitar = new Scanner(linea);
                    //se usa una expresión regular
                    //que valida que antes o despues de una coma (,) exista cualquier cosa
                    //parte la cadena recibida cada vez que encuentre una coma				
                    delimitar.useDelimiter("\\s*,\\s*");
                    servidor = delimitar.next();
                    puerto = delimitar.next();
                    usua = delimitar.next();
                    clav = delimitar.next();
                    
                }
                //se cierra el ojeto scanner
                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            
        } 
        Conexion con = new Conexion();
        con.conectar();
        firtstage = stage;
        Parent root = FXMLLoader.load(getClass().getResource("Screen2.fxml"));
        Scene scene = new Scene(root);
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
