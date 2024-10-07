package Cellphone1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Cellphone1Test {
    AvailableService availableService = Mockito.mock(AvailableService.class);

    @Test
    public void verifyTheRegistrationIsComplete(){
        Mockito.when(availableService.estaDisponible("Iphone 13","Apple")).thenReturn(true);
        Mockito.when(availableService.registrarPrestamo("Iphone 13", "Apple", "Maria López")).thenReturn(true);

        Cellphone cellphone = new Cellphone();

        cellphone.setAvailableService(availableService);
        Assertions.assertEquals("El celular Iphone 13 de Apple ha sido prestado a Maria López", cellphone.prestamoCelular("Iphone 13", "Apple", "Maria López"));

        Mockito.verify(availableService).estaDisponible("Iphone 13","Apple");
        Mockito.verify(availableService).registrarPrestamo("Iphone 13", "Apple", "Maria López");
    }

    @Test
    public void verifyTheCellphoneIsNotAvailable(){
        Mockito.when(availableService.estaDisponible("Iphone 16","Apple")).thenReturn(false);
        Mockito.when(availableService.registrarPrestamo("Iphone 16", "Apple", "Maria López")).thenReturn(true);

        Cellphone cellphone = new Cellphone();

        cellphone.setAvailableService(availableService);
        Assertions.assertEquals("El celular Iphone 16 de Apple no está disponible", cellphone.prestamoCelular("Iphone 16", "Apple", "Maria López"));

        Mockito.verify(availableService).estaDisponible("Iphone 16","Apple");
        Mockito.verify(availableService).registrarPrestamo("Iphone 16", "Apple", "Maria López");
    }

    @Test
    public void verifyTheRegistrationIsNotAvailable(){
        Mockito.when(availableService.estaDisponible("Iphone 13","Apple")).thenReturn(true);
        Mockito.when(availableService.registrarPrestamo("Iphone 13", "Apple", "Jazmin Villalba")).thenReturn(false);

        Cellphone cellphone = new Cellphone();

        cellphone.setAvailableService(availableService);
        Assertions.assertEquals("El celular Iphone 13 de Apple no está disponible", cellphone.prestamoCelular("Iphone 13", "Apple", "Jazmin Villalba"));

        Mockito.verify(availableService).estaDisponible("Iphone 13","Apple");
        Mockito.verify(availableService).registrarPrestamo("Iphone 13", "Apple", "Jazmin Villalba");
    }
}
