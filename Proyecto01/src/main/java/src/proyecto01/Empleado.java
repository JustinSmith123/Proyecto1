/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.proyecto01;

import java.util.ArrayList;

/**
 *
 * @author Justin Smith R.
 * @author Enzo Morales M.
 * @version 1.0
 */
public class Empleado extends Persona {
    private String rol = null;
    private String fechaIngreso = null;
    private String nombreUsuario = null;
    private String contrasenna = null;
    private static ArrayList<Empleado> listaEmpleados = new ArrayList();
    
    public Empleado(String pRol,String pFechaIngreso,String pNombreApellido,String pIdentificacion,String pTipoIdentificacion,String pFechaCumple,String pTelefono,String pCorreo){
        super(pNombreApellido,pIdentificacion,pTipoIdentificacion,pFechaCumple,pTelefono,pCorreo);
        rol = pRol;
        fechaIngreso = pFechaIngreso;
        listaEmpleados.add(this);
    }
    
    public Empleado(String pRol,String pFechaIngreso,String pNombreApellido,String pIdentificacion,String pTipoIdentificacion, String pFechaCumple,String pTelefono,String pCorreo,String pNombreUsuario, String pContrasenna){
        super(pNombreApellido,pIdentificacion,pTipoIdentificacion,pFechaCumple,pTelefono,pCorreo);
        rol = pRol;
        fechaIngreso = pFechaIngreso;
        nombreUsuario = pNombreUsuario;
        contrasenna = pContrasenna;
        listaEmpleados.add(this);
    }
    
    public Empleado() {super();}

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
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public static ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
}
