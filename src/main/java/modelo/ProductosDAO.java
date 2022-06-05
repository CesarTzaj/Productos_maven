
package modelo;

import config.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author Gabriel
 */
public class ProductosDAO {
    
    
    Connection Conexion;
    //throws ClassNotFoundException
    public ProductosDAO()  {
        conexion con = new conexion();
        try {
            Conexion = con.get_Connection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Productos> listarProductos(){
        
        PreparedStatement ps;
        ResultSet rs;
        //ResultSet
        List<Productos> lista = new ArrayList<>();
        try {
            //String query=;
            ps = Conexion.prepareStatement("SELECT * FROM almacen.productos  ");
            rs = ps.executeQuery();
            
            while (rs.next()){
            int id = rs.getInt("id");
            String codigo = rs.getString("codigo");
            String nombre = rs.getString("nombre");
            Double precio = rs.getDouble("precio");
            int existencia = rs.getInt("existencia");
            // codigo , nombre , precio  ,existencia
            Productos productos = new Productos( id,  codigo , nombre , precio  ,existencia);
            lista.add(productos);
            }
            return lista;
        } catch (SQLException e) {
            System.out.println(e);
        return null;
        }
        
    }
    
    public Productos mostrarProductos(int didd){
        
        PreparedStatement ps;
        ResultSet rs;
        //ResultSet
        Productos producto=null;
        try {
            //String query=;
            ps = Conexion.prepareStatement("SELECT * FROM almacen.productos WHERE id=?");
            ps.setInt(1,didd);
            rs = ps.executeQuery();
            
            while (rs.next()){
            int id = rs.getInt("id");
            String codigo = rs.getString("codigo");
            String nombre = rs.getString("nombre");
            Double precio = rs.getDouble("precio");
            int existencia = rs.getInt("existencia");
            
            producto = new Productos( id,  codigo , nombre , precio  ,existencia);

            }
            return producto;
        } catch (SQLException e) {
            System.out.println(e);
        return null;
        }
        
    }
    

    public boolean  insertar (Productos producto){
        
        PreparedStatement ps;

        try {
            //String query=;
            ps = Conexion.prepareStatement("INSERT INTO almacen.productos ( id, codigo, nombre, precio, existencia) " +
"VALUES (?,?,?,?,?)");
            ps.setInt(5,    producto.getExistencia());
            ps.setInt(1,    producto.getId());
            ps.setString(2, producto.getCodigo());
            ps.setString(3, producto.getNombre());
            ps.setDouble(4, producto.getPrecio());
            ps.setInt(5,    producto.getExistencia());
            
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        return false;
        }
        
    }
    
    public boolean  actulizar (Productos producto){
        
        PreparedStatement ps;

        try {
            //String query=;
            //UPDATE mensaje SET mensaje =?, author_mensjae = ? WHERE id_mensaje= ?
            ps = Conexion.prepareStatement("UPDATE almacen.productos  SET  codigo=?, nombre =?, precio=?, existencia=? WHERE id=?" );
            ps.setString(1, producto.getCodigo());
            ps.setString(2,producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4,producto.getExistencia());
            ps.setInt(5, producto.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        return false;
        }
        
    }
    
    public boolean  eliminar (int dd){
        
        PreparedStatement ps;

        try {
            //String query=;
            ps = Conexion.prepareStatement("DELETE FROM almacen.productos WHERE id =?" );
            ps.setInt(1, dd);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        return false;
        }
        
    }
        
}
