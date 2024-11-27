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

    @Test
    @DisplayName("10 - 2 = 8")
    public void testMinus1() {
        SimpleCalculator calculator = new SimpleCalculator();
        int rs = calculator.minus(10,2);

        assertThat(rs).isEqualTo(8);
    }

    @Test
    @DisplayName("10 * 2 = 20")
    public void testMutiply1() {
        SimpleCalculator calculator = new SimpleCalculator();
        int rs = calculator.multiply(10,2);

        assertThat(rs).isEqualTo(20);
    }

    @Test
    @DisplayName("10 / 2 = 5")
    public void testDivide1() {
        SimpleCalculator calculator = new SimpleCalculator();
        int rs = calculator.divide(10,2);

        assertThat(rs).isEqualTo(5);
    }

    @Test
    @DisplayName("10 % 2 = 0")
    public void testReminder1() {
        SimpleCalculator calculator = new SimpleCalculator();
        int rs = calculator.reminder(10,2);

        assertThat(rs).isEqualTo(0);
    }

}
