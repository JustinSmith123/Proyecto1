/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.proyecto01;
import interfazgrafica.VentanaSesion;
/**
 *
 * @author Justin Smith Rodriguez.
 * @version 1.0
 */
public class Main {
    public static void main(String[] agrs){
        String usuario = "Enzo";
        String contrasenna = "1234";
        
        Marca marcaSedan = new Marca("Sedan");
        Marca marca4x4 = new Marca("4x4");
        Marca marcaPickUp = new Marca("PickUp");
        Marca marcaSUV = new Marca("SUV");
        
        Modelo modelo1 = new Modelo("Perfecto para la familia", marcaSedan, "4", "4", "Super", "Automatico");
        Modelo modelo2 = new Modelo("Funciona en todos los terrenos", marca4x4, "2", "4", "Diesel", "Manual");
        Modelo modelo3 = new Modelo("Compacto y funcional", marcaPickUp, "2", "2", "Regular", "Automatico");
        Modelo modelo4 = new Modelo("Alto rendimiento en carreteras", marcaSUV, "4", "4", "Super", "Automatico");
        
        Empleado Enzo = new Empleado("Enzo Morales", "70215468", "Cédula nacional", "Empleado", "25/08/99", "06/10/19", "62315414", "Enzo44@gmail.com", "Enzo44", "1234");
        Empleado Justin = new Empleado("Justin Smith", "74785424", "Cédula nacional", "Empleado", "12/04/99", "06/10/19", "88542417", "Justin99@gmail.com", "Justin99", "5678");
        Empleado Cristian = new Empleado("Cristian Campos", "79654218", "Cédula nacional", "Gerente", "05/01/76", "06/10/19", "85424178", "Cristian76@gmail.com", "Cristian76", "9123");
        Empleado Nahum = new Empleado("Nahum Blanco", "74124287", "Cédula nacional", "Subgerente", "20/11/98", "06/10/19", "7521468", "Nahum98@gmail.com", "Nahum98", "4567");
        
        Vehiculo vehiculo1 = new Vehiculo(marcaSedan, modelo1, "2002", "365412");
        Vehiculo vehiculo2 = new Vehiculo(marca4x4, modelo2, "2008", "5428");
        Vehiculo vehiculo3 = new Vehiculo(marcaPickUp, modelo3, "2012", "857482");
        Vehiculo vehiculo4 = new Vehiculo(marcaSUV, modelo4, "2015", "546412");
        
        new VentanaSesion().setVisible(true);
    }
}
