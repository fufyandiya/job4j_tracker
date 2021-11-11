package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        return add(
                first,
                add(second, third)
        );
    }

    public double add(double first, double second, double third, double fourth) {
        return add(
                first,
                add(second, third, fourth)
        );
    }

    public double divide(int number) {
        return number / (double) x;
    }

    public double sumAllOperation(int number) {
        return (sum(number) + multiply(number) + minus(number) + divide(number));
    }

    public static int sum(int number) {
        return x + number;
    }

    public static int minus(int number) {
        return number - x;
    }

    public int multiply(int number) {
        return x * number;
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(minus(10));
        Calculator calculator = new Calculator();
        System.out.println(calculator.divide(26));
        System.out.println(calculator.sumAllOperation(103));
    }
}
