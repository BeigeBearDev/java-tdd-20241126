package org.tdd;

public class SimpleCalculator {
    // 더하기
    public int plus(int x, int y) {
        /* Green 단계 구현
        if(x == 1 && y == 2) {
            return 3;
        } else if (x == 2 && y == 14) {
            return 16;
        }
         */
        // Refactor 단계 구현
        return x + y;
    }

    // 빼기
    public int minus(int x, int y) {
        return x - y;
    }

    // 곱하기
    public int multiply(int x, int y) {
        return x * y;
    }

    // 나누기
    public int divide(int x, int y) {
        return x / y;
    }

    // 나머지
    public int reminder(int x, int y) {
        return x % y;
    }
}
