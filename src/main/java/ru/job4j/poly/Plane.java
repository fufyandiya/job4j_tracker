package ru.job4j.poly;

public class Plane implements Vehicle {
    public void move() {
        System.out.println("Самолет летит по воздуху.");
    }

    public void liftCapacity() {
        System.out.println("Самолет перевозит 100 пассажиров.");
    }
}
