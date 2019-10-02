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
public class enderezadoPintura extends Servicio{
    /**
     * partesVehiculo = indentifica las partes del vehiculo.
     */
    private String partesVehiculo = null;
    /**
     * usaPOliza = se encarga de determinar si hay poliza o no.
     */
    private boolean usaPoliza;
    /**
     * numeroCaso = nose
     */
    private static int numeroCaso;
    /**
     * Constructor de la clase.
     * @param pPartesVehiculo
     * @param pUsaPoliza 
     */
    public enderezadoPintura(String pPartesVehiculo, boolean pUsaPoliza,String pCedulaCliente, String pPlacaVehiculo, String pDescricionVehiculo, String pCosto, String pFechaRecibido, String pFechaTentativaEntrega, String pEstado, String pDescricionTrabajoRealizado){
        super(pCedulaCliente, pPlacaVehiculo,pDescricionVehiculo,pCosto,pFechaRecibido,pFechaTentativaEntrega,pEstado,pDescricionTrabajoRealizado);
        partesVehiculo = pPartesVehiculo;
        usaPoliza = pUsaPoliza;
    }
    /**
     * Devuelve el atributo partesVehiculo.
     * @return partesVehiculo
     */
    public String getPartesVehiculo() {
        return partesVehiculo;
    }
    /**
     * Modifica el atributo partesVehiculo.
     * @param partesVehiculo 
     */
    public void setPartesVehiculo(String partesVehiculo) {
        this.partesVehiculo = partesVehiculo;
    }
    /**
     * Devuelve el atributo usaPoliza.
     * @return usaPoliza
     */
    public boolean getUsaPoliza() {
        return usaPoliza;
    }
    /**
     * Modifica el atributo usaPoliza.
     * @param usaPoliza 
     */
    public void setUsaPoliza(boolean usaPoliza) {
        this.usaPoliza = usaPoliza;
    }
    /**
     * Devuelve el atributo numeroCaso.
     * @return numeroCaso
     */
    public static int getNumeroCaso() {
        return numeroCaso;
    }
    /**
     * Modifica el atributo numeroCaso.
     * @param numeroCaso 
     */
    public static void setNumeroCaso(int numeroCaso) {
        enderezadoPintura.numeroCaso = numeroCaso;
    }
    
    
}
