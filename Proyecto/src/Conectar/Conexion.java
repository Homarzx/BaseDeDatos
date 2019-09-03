    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import tiendaonline.TiendaOnline;

/**
 *
 * @author barce
 */
public class Conexion {
    Connection conectar = null;
    TiendaOnline pant;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://"+pant.servidor+":"+pant.puerto+"/dbfastbuy?useTimezone=true&serverTimezone=UTC",pant.usua,pant.clav);
            System.out.println(101010101);
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar: "+e.getMessage());
        }
        return conectar;
    }
}
