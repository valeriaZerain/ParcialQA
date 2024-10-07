package examen1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//6.1) Se requiere crear los unit test necesarios para garantizar para el método getStringDate()
//especificamente para el año 2024 retorna el dia en string basado en la fecha en el formato YYYY-MM-DD,
//solo se deben crear los unit test,  el método bajo testeo se compartirá
public class DateTest {
    @Test
    public void verifyDateIsCorrect(){
        DateUtils date = new DateUtils();
        String expectedResult = "MONDAY";
        Assertions.assertEquals(expectedResult, date.getDayOfWeek("2024-10-07"));
    }

    @Test
    public void verifyDateIsInvalid(){
        DateUtils date = new DateUtils();
        String expectedResult = "INVALID";
        Assertions.assertEquals(expectedResult, date.getDayOfWeek("2024-02-30"), "ERROR: the date does not exists");
    }

    @Test
    public void verifyInvalidFormatOfDate(){
        DateUtils date = new DateUtils();
        Assertions.assertThrows(Exception.class, () -> {date.getDayOfWeek("07-10-2024");});
    }

    @Test
    public void verifySeparatorsFormat(){
        DateUtils date = new DateUtils();
        Assertions.assertThrows(Exception.class, () -> {date.getDayOfWeek("2024/10/07");});
    }

}
