package com.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.tdd.SimpleCalculator;

// 테스트를 만들고 꼼수로 통과하고 리펙토링하고
public class SimpleCalculatorTest {
    @Test
    @DisplayName("1 + 2 = 3")
    public void testPlus1() {
        SimpleCalculator calculator = new SimpleCalculator();
        int rs = calculator.plus(1,2);

        Assertions.assertThat(rs).isEqualTo(rs == 3);
    }

    @Test
    @DisplayName("5 + 12 = 17")
    public void testPlus2() {
        SimpleCalculator calculator = new SimpleCalculator();
        int rs = calculator.plus(5,12);

        Assertions.assertThat(rs).isEqualTo(rs == 17);
    }


}
