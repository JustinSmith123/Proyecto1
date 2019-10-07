/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.proyecto01;

/**
 *
 * @author pc
 */
public class Persona {
    private String nombreApellido = null;
    private String identificacion = null; 
    private String tipoIdentificacion = null;
    private String fechaCumple = null;
    private String telefono = null;
    private String correoElectronico = null;
    public Persona(String pNombre,String pIdentificacion,String pTipoIdentificacion, String pFechaCumple,String pTelefono,String pCorreo){
        nombreApellido = pNombre;
        identificacion = pIdentificacion;
        tipoIdentificacion = pTipoIdentificacion;
        fechaCumple = pFechaCumple;
        telefono = pTelefono;
        correoElectronico = pCorreo;
    }
    
    public Persona() {}

    public String getNombre() {
        return nombreApellido;
    }

    public void setNombre(String nombre) {
        this.nombreApellido = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }
    
    
    
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFechaCumple() {
        return fechaCumple;
    }

    public void setFechaCumple(String fechaCumple) {
        this.fechaCumple = fechaCumple;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
