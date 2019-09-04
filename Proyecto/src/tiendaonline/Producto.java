/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaonline;

import Conectar.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;
import javax.swing.JOptionPane;

/**
 *
 * @author barce
 */

public class Producto {
    Connection cn;
    
    public String DevolverNombreUsuario(String idProducto) {
        
        String url = "";
        try {
            Conexion con = new Conexion();
            cn = con.conectar();

            String sql = "CALL BUSCAR_FOTO(?,?)";

            CallableStatement pst = cn.prepareCall(sql);
   
            pst.setString(1, idProducto);
            pst.registerOutParameter(2, Types.VARCHAR);
            
            
            pst.execute();
            
            url = pst.getString(2);
            pst.executeUpdate();

            pst.close();
            cn.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "VERIFICAR INFORMACION");
        }
        return url;
    }
}
