package ru.job4j.inheritance;

public class Engineer extends Profession {
    private int experienceOfEngineering;

    public Engineer(String name, String patronymic, String education,
                    String birthday, int experienceOfEngineering) {
        super(name, patronymic, education, birthday);
        this.experienceOfEngineering = experienceOfEngineering;
    }

    public Engineer(int experienceOfEngineering) {
        this.experienceOfEngineering = experienceOfEngineering;
    }

    public Engineer() {
    }
}
