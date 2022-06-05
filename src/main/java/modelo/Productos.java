
package modelo;

import config.conexion;
import java.sql.Connection;
import java.sql.SQLException;

public class Productos {

    private int id, existencia;
    private String codigo, nombre;
    private double precio;

    public Productos() {
    }

    public Productos(int id,  String codigo, String nombre ,double precio ,  int existencia) {
        this.id = id;
        this.existencia = existencia;
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

  /*      public static void main(String[] args) {
       conexion con= new conexion();
       
       try( Connection cnx= con.get_Connection()){
             System.out.println("conexion exitosa");
       }catch(SQLException r){
           System.out.println(r);
       }
        }
*/
}
