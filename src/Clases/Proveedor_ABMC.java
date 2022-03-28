package Clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Proveedor_ABMC.java
//  @ Date : 14/11/2016
//  @ Author : 
//
//
public class Proveedor_ABMC {

    private Clases.Conexion conexion = new Clases.Conexion();
    private Connection con;
    private Statement st;
    private ResultSet rs;

    public Proveedor_ABMC() {
        try {
            if ((con = conexion.getConexionMYSQL()) == null) {
                JOptionPane.showMessageDialog(null, "Error con la conexion a la BD");
                return;
            }
            st = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean insert(int Idproveedor, String pais, String area) {
        try {
            String query = "INSERT INTO proveedor VALUES('" + Idproveedor + "','" + pais + "','" + area + "',0)";
            st.executeUpdate(query);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public ResultSet selectXtodas() {
        try {
            String query = "SELECT IdProveedor,Pais,Area FROM `proveedor` WHERE indexB=0";
            rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public ResultSet selectCOD() {
        try {
            String query = "SELECT IdProveedor FROM proveedor WHERE indexB=0";
            rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public boolean delete(int id) {
        try {
            String query = "UPDATE proveedor SET"
                    + " indexB = '1' "
                    + " WHERE IdProveedor = '" + id + "';";
            st.executeUpdate(query);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(int Idproveedor, String pais, String area) {
        try {
            String query = "UPDATE proveedor SET"
                    + " pais = '" + pais + "',"
                    + " area = '" + area + "' "
                    + " WHERE IdProveedor = '" + Idproveedor + "';";
            st.executeUpdate(query);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}