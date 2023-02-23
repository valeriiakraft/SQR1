package ru.netology.sqr1.sqr1.servis;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {
    @Test
    public void valuesInTheLimit() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.numOfSquares(200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void valuesAboveTheLimit() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.numOfSquares(9900, 100_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void valuesBelowTheLimit() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.numOfSquares(10, 99);
        Assertions.assertEquals(expected, actual);
    }
}