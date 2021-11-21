package ru.job4j.oop;

/**
 * Up casting - приведение конкретного типа к более общему типу данных
 * Down casting - приведение от общего типа к более конкретному.
 */

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student std = freshman;
        Object obj = freshman;
    }
}
