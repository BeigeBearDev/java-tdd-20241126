package com.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.tdd.SimpleCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 테스트를 만들고 꼼수로 통과하고 리펙토링하고 한다.
public class SimpleCalculatorTest {

    @Test
    @DisplayName("1 + 2 = 3")
    public void testPlus1() {
        SimpleCalculator calculator = new SimpleCalculator();
        int rs = calculator.plus(1,2);

        assertEquals(3, rs); //rs가 3이기를 기대한다(expected)
    }

    @Test
    @DisplayName("2 + 14 = 16")
    public void testPlus2() {
        SimpleCalculator calculator = new SimpleCalculator();
        int rs = calculator.plus(2,14);

        assertEquals(16, rs); //rs가 16이기를 기대한다(expected)
    }

}
