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
public class Modelo {
    private String descricion = null;
    private Marca marca = null;
    private String cantidadAsientos = null;
    private String cantidadPuertas = null;
    private String combustible = null;
    private String transmision = null;
    public Modelo(String pDescricion,Marca pMarca,String pCantidadAsientos,String pCantidadPuertas,String pCombustible,String pTransmision){
        descricion = pDescricion;
        marca = pMarca;
        cantidadAsientos = pCantidadAsientos;
        cantidadPuertas = pCantidadPuertas;
        combustible = pCombustible;
        transmision = pTransmision;
    }
    
}
