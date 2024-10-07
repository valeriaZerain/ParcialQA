package Cellphone2;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class CellphoneStaticMockTest {
    MockedStatic<AvailableGlobal> available = Mockito.mockStatic(AvailableGlobal.class);

    @Test
    public void verifyTheRegistrationIsComplete(){
        available.when(()->AvailableGlobal.registrarPrestamo("Iphone 13", "Apple", "Maria López")).thenReturn(true);
        available.when(()->AvailableGlobal.estaDisponible("Iphone 13", "Apple")).thenReturn(true);
    }
}
