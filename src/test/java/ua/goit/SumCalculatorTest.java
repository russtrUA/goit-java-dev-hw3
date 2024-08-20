package ua.goit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    public void beforeEach() {
        calculator = new SumCalculator();
    }

    @ParameterizedTest
    @CsvSource({"1,1", "3,6"})
    void testThatSumReturnsCorrectValue(int input, int expected) {
        int actualValue = calculator.sum(input);
        assertEquals(expected, actualValue);
    }

    @Test
    void testThatSum0ThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculator.sum(0));
    }
}
