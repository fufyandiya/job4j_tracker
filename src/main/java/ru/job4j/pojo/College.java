package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student vasya = new Student();
        vasya.setFio("Иванов Василий Иванович");
        vasya.setGroup("АЭС-С14");
        vasya.setDateOfStudy("01.08.2014");
        System.out.println(vasya.getFio() + " учится в группе " + vasya.getGroup()
        + ", начало учебы - " + vasya.getDateOfStudy());
    }
}
