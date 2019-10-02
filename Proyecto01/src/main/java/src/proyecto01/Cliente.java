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
public class Cliente extends Persona{
    private String provincia = null;
    private String canton = null;
    public Cliente(String pProvincia,String pCanton,String pNombre,String pApellido,String pIdentificacion,String pFechaCumple,String pCorreo){
        super(pNombre,pApellido,pIdentificacion,pFechaCumple,pCorreo);
        provincia = pProvincia;
        canton = pCanton;
    }

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
    
}
