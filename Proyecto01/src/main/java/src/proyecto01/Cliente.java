/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.proyecto01;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class Cliente extends Persona{
    private String provincia = null;
    private String canton = null;
    private ArrayList<Vehiculo> listaVehiculos = new ArrayList();
    private static ArrayList<Cliente> listaClientes = new ArrayList();
    
    public Cliente(String pProvincia,String pCanton,String pNombreApellido,String pIdentificacion,String tipoIdentificacion,String pFechaCumple,String pTelefono,String pCorreo){
        super(pNombreApellido,pIdentificacion,tipoIdentificacion,pFechaCumple,pTelefono,pCorreo);
        provincia = pProvincia;
        canton = pCanton;
        listaClientes.add(this);
    }
    
    public Cliente () {}

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public static ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    public void agregarVehiculo(Vehiculo nVehiculo) {
        listaVehiculos.add(nVehiculo);
    }
    
}
