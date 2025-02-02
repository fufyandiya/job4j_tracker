package ru.job4j.oop;

import static org.junit.Assert.*;

import org.junit.Test;

public class PointTest {

    @Test
    public void testFirst2D() {
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(1, 0);
        assertEquals(1, firstPoint.distance(secondPoint), 0.01);
    }

    @Test
    public void testSecond2D() {
        Point firstPoint = new Point(1, 1);
        Point secondPoint = new Point(3, 3);
        assertEquals(2.83, firstPoint.distance(secondPoint), 0.01);
    }

    @Test
    public void testFirst3D() {
        Point firstPoint = new Point(0, 0, 0);
        Point secondPoint = new Point(1, 1, 1);
        assertEquals(1.73, firstPoint.distance3d(secondPoint), 0.01);
    }

    @Test
    public void testSecond3D() {
        Point firstPoint = new Point(0, 0, 0);
        Point secondPoint = new Point(1, 0, 0);
        assertEquals(1, firstPoint.distance3d(secondPoint), 0.01);
    }
}