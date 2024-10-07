package Cellphone1;

import Cellphone1.AvailableService;

public class Cellphone {
    public AvailableService availableService;
    public Cellphone(){
        availableService = new AvailableService();
    }

    public void setAvailableService(AvailableService availableService){
        this.availableService = availableService;
    }
    public String prestamoCelular(String modelo, String marca, String usuario){
        if(availableService.estaDisponible(modelo, marca) && availableService.registrarPrestamo(modelo, marca, usuario)){
            return "El celular " + modelo + " de " + marca + " ha sido prestado a " + usuario;
        }else{
            return "El celular " + modelo + " de " + marca + " no está disponible";
        }
    }
}
