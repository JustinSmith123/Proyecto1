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
public class Marca {
    private String categoria = null;
    private static ArrayList<Marca> listaMarcas = new ArrayList();
    
    public Marca(String pCategoria){
        categoria = pCategoria;
        listaMarcas.add(this);
    }
    
    public Marca() {}

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public ArrayList<Marca> getListaMarcas() {
        return listaMarcas;
    }
    
}
