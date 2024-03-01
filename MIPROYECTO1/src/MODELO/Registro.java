/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;


import Conexion.ConexionMysql;




public class Registro {
   ConexionMysql con=new ConexionMysql ();
   Connection cn=con.conectar ();
   
   
   public void registrarbd(Producto p) {
       try {
           PreparedStatement ps=cn.prepareDStatement
         ("INSERT INTO producto (nombre,cantida,precio,total)VALUES(?,?,?,?)");
           ps.setString(1, p.getNombre());
              ps.setint(2, p.getCantidad());
                 ps.setDouble(3, p.getPrecio());
                    ps.setDouble(4, p.getTotal());
                    ps.executeUpdate();
           
       }catch (Exception e){
           JOptionPane.ShowMessageDialog(null, "Error al Registrar Datos"+e);
           
       }
       
   }
   
    
}
