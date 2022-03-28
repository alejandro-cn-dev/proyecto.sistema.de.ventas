package Clases;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Cliente.java
//  @ Date : 14/11/2016
//  @ Author : 
//
//

public class Cliente {

    private int IdCliente;
    private String TipoId;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String FechaNac;
    private int Telefono;
    private String Email;

    public Cliente(int IdCliente,String TipoId, String Nombre, String Apellido, String Direccion, String FechaNac, int Telefono, String Email) {
        this.IdCliente = IdCliente;
        this.TipoId=TipoId;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.FechaNac = FechaNac;
        this.Telefono = Telefono;
        this.Email = Email;
    }


    /**
     * @return the IdCliente
     */
    public int getIdCliente() {
        return IdCliente;
    }

    /**
     * @param IdCliente the IdCliente to set
     */
    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the FechaNac
     */
    public String getFechaNac() {
        return FechaNac;
    }

    /**
     * @param FechaNac the FechaNac to set
     */
    public void setFechaNac(String FechaNac) {
        this.FechaNac = FechaNac;
    }

    /**
     * @return the Telefono
     */
    public int getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }
    @Override
        public String toString()
        {
            return String.valueOf(IdCliente);
        }

    /**
     * @return the TipoId
     */
    public String getTipoId() {
        return TipoId;
    }

    /**
     * @param TipoId the TipoId to set
     */
    public void setTipoId(String TipoId) {
        this.TipoId = TipoId;
    }
}