/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import com.Mysql.jdbc.Connection;
public class ConexionMysql {
    
    Connection cn;
    
    public Connection conectar () {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/miproyecto1","root","");
            System.out.println("Conexion Exitosa");
            
            
        }catch (Exeption e) {
            System.out.println("Error de Conexion" +e);
        
    }
        return cn;
    
    
}

}