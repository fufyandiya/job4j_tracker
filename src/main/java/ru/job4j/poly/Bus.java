package ru.job4j.poly;

public class Bus implements Transport {
    private int gasCost = 42;
    private int passengers;

    @Override
    public void ride() {
        System.out.println("Bus is riding");
    }

    @Override
    public void passengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public int fillCost(int litres) {
        return gasCost * litres;
    }
}
