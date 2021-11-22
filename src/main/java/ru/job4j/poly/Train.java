package ru.job4j.poly;

public class Train implements Vehicle {
    public void move() {
        System.out.println("Поезд едет по рельсам.");
    }

    public void liftCapacity() {
        System.out.println("Поезд перевозит 100 тонн груза.");
    }
}
