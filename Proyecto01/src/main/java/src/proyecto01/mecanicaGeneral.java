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
public class mecanicaGeneral extends Servicio{
    /**
     * descricionProblema = identifica si el servicio tiene un problema en expecifico.
     */
    private String descricionProblema = null;
    public mecanicaGeneral(String pDescricionProblema, String pCedulaCliente, String pPlacaVehiculo,String pDescricionVehiculo, String pCosto, String pFechaRecibido,String pFechaTentativaEntrega,String pEstado,String pDescricionTrabajoRealizado){
        super(pCedulaCliente, pPlacaVehiculo,pDescricionVehiculo,pCosto,pFechaRecibido,pFechaTentativaEntrega,pEstado,pDescricionTrabajoRealizado);
        descricionProblema = pDescricionProblema;
        
    }

    public String getDescricionProblema() {
        return descricionProblema;
    }

    public void setDescricionProblema(String descricionProblema) {
        this.descricionProblema = descricionProblema;
    }
    
}
