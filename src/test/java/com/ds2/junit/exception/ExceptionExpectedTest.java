package com.ds2.junit.exception;

import org.junit.Test;

import java.util.ArrayList;

public class ExceptionExpectedTest {
    @Test(expected = ArithmeticException.class)
    public void testDivisionWithException() {
        int i = 1 / 0;
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyList() {
        new ArrayList<>().get(0);
    }
}