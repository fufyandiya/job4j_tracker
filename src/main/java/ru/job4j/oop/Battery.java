package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery() {
    }

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery batteryOne = new Battery(25);
        Battery batteryTwo = new Battery(14);
        System.out.println("Заряд первой батарейки до обмена: " + batteryOne.load);
        System.out.println("Заряд второй батарейки до обмена: " + batteryTwo.load);
        batteryOne.exchange(batteryTwo);
        System.out.println("Заряд первой батарейки после обмена: " + batteryOne.load);
        System.out.println("Заряд второй батарейки после обмена: " + batteryTwo.load);
    }
}
