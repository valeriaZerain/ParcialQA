package Cellphone2;

public class Cellphone2Static {
    public String prestamoCelular(String modelo, String marca, String usuario){
        if(AvailableGlobal.estaDisponible(modelo, marca) && AvailableGlobal.registrarPrestamo(modelo, marca, usuario)){
            return "El celular " + modelo + " de " + marca + " ha sido prestado a " + usuario;
        }else{
            return "El celular " + modelo + " de " + marca + " no está disponible";
        }
    }
}