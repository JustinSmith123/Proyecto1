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
public class Servicio {
    private String cedulaCliente = null;
    private String placaVehiculo = null;
    private String descricionVehiculo = null;
    private String costo = null;
    private String fechaRecibido = null;
    private String fechaTentativaEntrega = null;
    private String estado = null;
    private ArrayList<Persona> empleadosCargo;
    private String descricionTrabajoRealizado = null;
    
    public Servicio(String pCedulaCliente, String pPlacaVehiculo,String pDescricionVehiculo, String pCosto, String pFechaRecibido,String pFechaTentativaEntrega,String pEstado,String pDescricionTrabajoRealizado){
        cedulaCliente = pCedulaCliente;
        placaVehiculo = pPlacaVehiculo;
        descricionVehiculo = pDescricionVehiculo;
        costo = pCosto;
        fechaRecibido = pFechaRecibido;
        fechaTentativaEntrega = pFechaTentativaEntrega;
        estado = pEstado;
        descricionTrabajoRealizado = pDescricionTrabajoRealizado;
        empleadosCargo = new ArrayList();
    }
}
