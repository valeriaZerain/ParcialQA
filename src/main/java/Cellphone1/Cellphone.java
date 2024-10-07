package examen1;

public class Cellphone {
    public AvailableService availableService;
    public Cellphone(){
        availableService = new AvailableService();
    }
    public String prestamoCelular(String modelo, String marca, String usuario){
        if(availableService.estaDisponible(modelo, marca) && availableService.registrarPrestamo(modelo, marca, usuario)){
            return "El celular " + modelo + " de " + marca + " ha sido prestado a " + usuario;
        }else{
            return "El celular " + modelo + " de " + marca + " no está disponible";
        }
    }
}
