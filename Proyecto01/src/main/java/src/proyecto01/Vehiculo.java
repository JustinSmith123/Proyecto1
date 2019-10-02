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
public class Vehiculo {
    private Marca marca = null;
    private Modelo model = null;
    private String anno = null;
    private String placa = null;
    public Vehiculo(Marca pMarca,Modelo pModelo, String pAnno, String pPlaca){
        marca = pMarca;
        model = pModelo;
        anno = pAnno;
        placa = pPlaca;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModel() {
        return model;
    }

    public void setModel(Modelo model) {
        this.model = model;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
