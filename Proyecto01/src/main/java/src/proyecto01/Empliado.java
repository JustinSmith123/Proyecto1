/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.proyecto01;

/**
 *
 * @author Justin Smith R.
 * @author Enzo Morales M.
 * @version 1.0
 */
public class Empliado extends Persona {
    private String rol = null;
    private String fechaIngreso = null;
    public Empliado(String pRol,String pFechaIngreso,String pNombre,String pApellido,String pIdentificacion,String pFechaCumple,String pCorreo){
        super(pNombre,pApellido,pIdentificacion,pFechaCumple,pCorreo);
        rol = pRol;
        fechaIngreso = pFechaIngreso;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
}
