import ru.netology.sqr.java_6.service.SQRService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {

    @Test
    public void FirstNumber() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqrt(200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SecondNumber() {
        SQRService service = new SQRService();

        int expected = 8;
        int actual = service.calcSqrt(100, 300);
        Assertions.assertEquals(expected, actual);
    }


}
