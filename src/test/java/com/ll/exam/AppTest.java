package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void 더하기_1(){
        int result = Calculator.calc("10 + 20");

        assertEquals(30, result);
    }
    @Test
    public void 더하기_2(){
        int result = Calculator.calc("20 + 20");

        assertEquals(40, result);
    }

    @Test
    public void 더하기_3(){
        int result = Calculator.calc("10 + 10");

        assertEquals(20, result);
    }

    @Test
    public void 빼기(){
        int result = Calculator.calc("10 - 10");

        assertEquals(0, result);
    }

    @Test
    public void 곱하기(){
        int result = Calculator.calc("10 * 10");

        assertEquals(100, result);
    }

    @Test
    public void 나누기(){
        int result = Calculator.calc("100 / 10");

        assertEquals(10, result);
    }
}
