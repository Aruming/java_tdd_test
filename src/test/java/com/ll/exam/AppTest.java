package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void 더하기_테스트_2(){
        int result = Calculator.add("20 + 20");

        assertEquals(40, result);
    }

    @Test
    public void 더하기_테스트3(){
        int result1 = Calculator.add("10 + 10");

        assertEquals(20, result1);
    }
}
