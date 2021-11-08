package ru.job4j.inheritance;

public class Doctor extends Profession {
    private int experienceOfHealing;

    public Doctor(String name, String patronymic, String education,
                    String birthday, int experienceOfHealing) {
        super(name, patronymic, education, birthday);
        this.experienceOfHealing = experienceOfHealing;
    }
}
