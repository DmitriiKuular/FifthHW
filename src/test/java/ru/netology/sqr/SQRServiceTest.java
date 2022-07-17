package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Sqr.csv")
    void shouldCalculateAmountSqrInThisArea(int expected, int x, int y) {
        SQRService service = new SQRService();
        long actual = service.calcSqr(x, y);
        Assertions.assertEquals(expected, actual);
    }
}
