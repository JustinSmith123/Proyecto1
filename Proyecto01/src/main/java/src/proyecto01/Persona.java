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
    private String nombre = null;
    private String apellido = null;
    private String identificacion = null;  
    private String fechaCumple = null;
    private String correoElectronico = null;
    public Persona(String pNombre,String pApellido,String pIdentificacion,String pFechaCumple,String pCorreo){
        nombre = pNombre;
        apellido = pApellido;
        identificacion = pIdentificacion;
        fechaCumple = pFechaCumple;
        correoElectronico = pCorreo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
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
    
}
