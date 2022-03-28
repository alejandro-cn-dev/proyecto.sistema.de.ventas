package Clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


//
//  @ Project : Untitled
//  @ File Name : Factura.java
//  @ Date : 14/11/2016
//  @ Author : 
//
//




public class Factura_ABMC {
    private Clases.Conexion conexion = new Clases.Conexion();
    private Connection con;
    private Statement st;
    private ResultSet rs;

    public Factura_ABMC() {
        try{
            if((con = conexion.getConexionMYSQL())==null){
                JOptionPane.showMessageDialog(null,"Error con la conexion a la BD");
                return;
            }
            st = con.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public boolean insert(int idcliente, String fecha, int idcaja, double total){
        try {
            String query = "INSERT INTO factura VALUES(NULL,'"+idcliente+"','"+fecha+"','"+idcaja+"','"+total+"',0)";
            st.executeUpdate(query);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    public ResultSet selectXtodas(){
        try {
            String query = "SELECT a.num_factura, b.Nombre, a.fecha, a.IdCaja, a.total FROM factura as a, cliente as b WHERE (a.id_cliente=b.id_cliente) AND (a.indexB=0)";
            rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public ResultSet consultaMM(int idcliente, String fecha, int idcaja){
        try {
            String query = "SELECT num_factura FROM factura WHERE (fecha = '"+fecha+"') AND (id_cliente='"+idcliente+"') AND (IdCaja='"+idcaja+"') AND (indexB=0)";
            rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public ResultSet IdNombre(int nom){
        try {
            String query = "SELECT num_factura FROM factura WHERE (id_cliente = '"+nom+"') AND (indexB=0)";
            rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
            
        public boolean delete(int id){
        try {
            String query = "UPDATE factura SET"                   
                    + " indexB='1' WHERE num_factura = '"+id+"';";
            st.executeUpdate(query);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    public boolean update(int num, int idcliente, String fecha, int idcaja){
        try {
            String query = "UPDATE factura SET"
                    + " id_cliente = '"+idcliente+"',"
                    + " fecha = '"+fecha+"' "
                    + " IdCaja = '"+idcaja+"' "
                    + " WHERE num_factura = '"+num+"';";
            st.executeUpdate(query);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
