package com.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.tdd.SimpleCalculator;

import static org.assertj.core.api.Assertions.assertThat;

// 테스트를 만들고 꼼수로 통과하고 리펙토링하고 한다.
public class SimpleCalculatorTest {

    @Test
    @DisplayName("1 + 2 = 3")
    public void testPlus1() {
        SimpleCalculator calculator = new SimpleCalculator();
        int rs = calculator.plus(1,2);

        //rs가 3이기를 기대한다(expected)
        // assertEquals(3, rs);
        assertThat(rs).isEqualTo(3);
    }

    @Test
    @DisplayName("2 + 14 = 16")
    public void testPlus2() {
        SimpleCalculator calculator = new SimpleCalculator();
        int rs = calculator.plus(2,14);

        assertThat(rs).isEqualTo(16);
    }

    @Test
    @DisplayName("20 + 10 = 30")
    public void testPlus3() {
        SimpleCalculator calculator = new SimpleCalculator();
        int rs = calculator.plus(20,10);

        assertThat(rs).isEqualTo(30);
    }

}
