import ru.netology.sqr.java_6.service.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqrt(200, 300);
        System.out.println(expected + " == ? == " + actual);

    }
}
