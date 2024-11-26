package com.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.tdd.SimpleCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 테스트를 만들고 꼼수로 통과하고 리펙토링하고
public class SimpleCalculatorTest {
    @Test
    @DisplayName("1 + 2 = 3")
    public void testPlus() {
        SimpleCalculator calculator = new SimpleCalculator();
        int rs = calculator.plus(1,2);

        assertEquals(3, rs);
    }
}
