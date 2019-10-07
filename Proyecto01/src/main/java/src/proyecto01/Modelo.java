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
public class Modelo {
    private String descripcion = null;
    private Marca marca = null;
    private String cantidadAsientos = null;
    private String cantidadPuertas = null;
    private String combustible = null;
    private String transmision = null;
    private static ArrayList<Modelo> listaModelos = new ArrayList();
    
    public Modelo(String pDescripcion,Marca pMarca,String pCantidadAsientos,String pCantidadPuertas,String pCombustible,String pTransmision){
        descripcion = pDescripcion;
        marca = pMarca;
        cantidadAsientos = pCantidadAsientos;
        cantidadPuertas = pCantidadPuertas;
        combustible = pCombustible;
        transmision = pTransmision;
        listaModelos.add(this);
    }
    
    public Modelo() {}

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descricion) {
        this.descripcion = descricion;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(String cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public String getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(String cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
    
    public ArrayList<Modelo> getListaModelos() {
        return listaModelos;
    }
}
