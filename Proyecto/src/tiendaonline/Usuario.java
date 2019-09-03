/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaonline;

import Conectar.Conexion;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author barce
 */
public class Usuario {
    Connection cn;
    
    
    public void RegistrarUsuarioComprador(JFXTextField cedula, JFXTextField nombres,JFXTextField apellidos,String tipoUsuario,JFXTextField edad,JFXTextField telefono,JFXTextField correo,JFXPasswordField contraseña) {
        try {
            Conexion con = new Conexion();
            cn = con.conectar();

            String sql = "CALL REGISTRAR_USUARIO_COMPRADOR (?,?,?,?,?,?,?,?)";

            PreparedStatement pst = cn.prepareCall(sql);

            pst.setString(1, cedula.getText());
            pst.setString(2, nombres.getText());
            pst.setString(3, apellidos.getText());
            pst.setString(4, tipoUsuario);
            pst.setString(5, edad.getText());
            pst.setString(6, telefono.getText());
            pst.setString(7, correo.getText());
            pst.setString(8, contraseña.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "SE HA REGISTRADO UN NUEVO USUARIO COMPRADOR");

            pst.close();
            cn.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "FALTA LLENAR CAMPOS");
        }
    }
    
    public void RegistrarUsuarioVendedor(JFXTextField cedula, JFXTextField nombres,JFXTextField apellidos,String tipoUsuario,JFXTextField nomTienda,JFXTextField telefono,JFXTextField ruc,JFXTextField correo,JFXPasswordField contraseña) {
        try {
            Conexion con = new Conexion();
            cn = con.conectar();

            String sql = "CALL REGISTRAR_USUARIO_VENDEDOR (?,?,?,?,?,?,?,?)";

            PreparedStatement pst = cn.prepareCall(sql);

            pst.setString(1, cedula.getText());
            pst.setString(2, nombres.getText());
            pst.setString(3, apellidos.getText());
            pst.setString(4, tipoUsuario);
            pst.setString(5, nomTienda.getText());
            pst.setString(6, telefono.getText());
            pst.setString(7, ruc.getText());
            pst.setString(8, correo.getText());
            pst.setString(9, contraseña.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "SE HA REGISTRADO UN NUEVO USUARIO VENDEDOR");

            pst.close();
            cn.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "FALTA LLENAR CAMPOS");
        }
    }
    
    public String[] ComprobarCuenta(JFXTextField correo) {
        String[] lista = new String[3];
        try {
            Conexion con = new Conexion();
            cn = con.conectar();

            String sql = "CALL BUSCAR_CUENTA(?,?,?,?,?)";

            PreparedStatement pst = cn.prepareCall(sql);

            pst.setString(1, correo.getText());
            pst.setString(2, lista[0]);
            pst.setString(3, lista[1]);
            pst.setString(4, lista[2]);
            pst.setString(5, lista[3]);
            
            pst.executeUpdate();
            
            pst.close();
            cn.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "VERIFICAR INFORMACION");
        }
        return lista;
    }
    
    public String DevolverNombreUsuario(String cedula) {
        String[] lista = new String[2];
        String nombre = "";
        try {
            Conexion con = new Conexion();
            cn = con.conectar();

            String sql = "CALL BUSCAR_USUARIO_DEVUELVE_NOMBRE(?,?)";

            PreparedStatement pst = cn.prepareCall(sql);

            pst.setString(1, cedula);
            pst.setString(2, nombre);
            lista = nombre.split(" ");
            
            pst.executeUpdate();
            
            pst.close();
            cn.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "VERIFICAR INFORMACION");
        }
        return lista[0];
    }
}