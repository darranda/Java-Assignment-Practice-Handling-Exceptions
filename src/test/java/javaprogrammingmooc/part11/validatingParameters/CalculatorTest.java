package javaprogrammingmooc.part11.validatingParameters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testFactorialwithZeroshouldREqualOne() {
        Calculator calculator = new Calculator();

        int result = calculator.factorial(0);

        System.out.println("Factorial of 0: " + result);
        Assertions.assertEquals(1, result);
    }
    @Test
    void testFactorialwithNegativeNumToThrowIllegalArgument() {
        Calculator calculator = new Calculator();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-5);
        });
        System.out.println("Exception thrown for factorial of -5");
    }
}
