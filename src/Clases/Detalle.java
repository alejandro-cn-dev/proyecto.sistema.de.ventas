package Clases;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Detalle.java
//  @ Date : 14/11/2016
//  @ Author : 
//
//

public class Detalle {

    private int num_detalle;
    private int num_factura;
    private int IdProducto;
    private int Cantidad;
    private double Precio;

    public Detalle(int numd, int numf, int id, int cant, double precio) {
        this.num_detalle = numd;
        this.num_factura = numf;
        this.IdProducto = id;
        this.Cantidad = cant;
        this.Precio = precio;
    }

    /**
     * @return the num_detalle
     */
    public int getNum_detalle() {
        return num_detalle;
    }

    /**
     * @param num_detalle the num_detalle to set
     */
    public void setNum_detalle(int num_detalle) {
        this.num_detalle = num_detalle;
    }

    /**
     * @return the num_factura
     */
    public int getNum_factura() {
        return num_factura;
    }

    /**
     * @param num_factura the num_factura to set
     */
    public void setNum_factura(int num_factura) {
        this.num_factura = num_factura;
    }

    /**
     * @return the IdProducto
     */
    public int getIdProducto() {
        return IdProducto;
    }

    /**
     * @param IdProducto the IdProducto to set
     */
    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    /**
     * @return the Cantidad
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    /**
     * @return the Precio
     */
    public double getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    @Override
        public String toString()
        {
            return String.valueOf(num_detalle);
        }
}