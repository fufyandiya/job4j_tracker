package ru.job4j.poly;

public class Autobus implements Vehicle {
    public void move() {
        System.out.println("Автобус едет по дороге.");
    }

    public void liftCapacity() {
        System.out.println("Автобус перевозит 40 пассажиров.");
    }
}
