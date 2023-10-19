package task5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    @ParameterizedTest
    @CsvSource({"2, 3, 6",
            "0, 5, 0",
            "-2, -4, 8",
            "10, -2, -20"})
    public void testMultiply(int a, int b, int expectedResult) {
        BigDecimal MathUtils;
        int result = MathUtils.multiply(a, b);
        assertEquals(expectedResult, result, "Некорректное умножение");
    }
}