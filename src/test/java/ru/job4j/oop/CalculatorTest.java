package ru.job4j.oop;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSumForTwo() {
        Calculator calc = new Calculator();
        assertEquals(4.1, calc.add(1.5, 2.6), 0.01);
    }

    @Test
    public void testSumForThree() {
        Calculator calc = new Calculator();
        assertEquals(6.97, calc.add(1.94, 2.03, 3), 0.01);
    }

    @Test
    public void testSumForFour() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.add(1, 2, 3, 4), 0.01);
    }
}