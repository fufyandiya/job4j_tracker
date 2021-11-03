package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println("Кличка кота: " + this.name);
        System.out.println("Он ел: " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Гав");
        gav.eat("котлета");
        gav.show();
        Cat black = new Cat();
        black.giveNick("Черныш");
        black.eat("рыба");
        black.show();
    }
}
