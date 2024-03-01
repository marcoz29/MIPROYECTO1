/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import Conexion.ConexionMysql;
import java.sql.Connection;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class ListarProductos {
    ConexionMysql con=new ConexionMysql();
    Connection cn=con.conectar();
    
    public void MostrarTable(JTable tabla){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("ID");
          modelo.addColumn("Nombre");
            modelo.addColumn("Cantidad");
              modelo.addColumn("Precio");
               modelo.addColumn("Total");
               String consultasql="SELECT*FROM producto";
               Statement st;
               try {
                  st=cn.createStatement();
                  ResultSet rs=st.executeQuery(consultasql);
                  while (rs.next ()) {
                   Object [] lista =(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getDouble), rs.getDouble(5)};
                   modelo.addRow(lista);
                   
                   
               }
               tabla.setModel(modelo);
                 
               }catch (Exception e) {
    
              System.out.println("Error al Listar los Datos"+e );
    
    
    
        
    }
    
}
