/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Gabriel
 */
public class conexion {
    public Connection get_Connection() throws ClassNotFoundException{ 
      //com.mysql.cj.jdbc.Driver
      //com.mysql.jdbc.Driver
        try {
            Class.forName("com.mysql.jdbc.Driver");

           Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/almacen","root","Cesar2539");
            System.out.println("conexion exitosa");
            return connection;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        
    }
}
