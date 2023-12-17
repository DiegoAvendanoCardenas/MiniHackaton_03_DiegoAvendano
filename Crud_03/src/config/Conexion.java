/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author dieoa
 */
public class Conexion {
    Connection con;
    
    String url = "jdbc:mysql://localhost:3306/s17?characterEncoding=UTF-8";
    String usuario = "root";
    String contraseña = "123";
    
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, contraseña);
        } catch (Exception e) {
            System.out.println("Error Conexion " + e);
        }
    }
    
    public Connection getConection() {
        return con;
    }
    
    
}

