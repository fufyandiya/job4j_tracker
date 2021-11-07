package ru.job4j.inheritance;

public class Profession {
    private String name;
    private String patronymic;
    private String education;
    private String birthday;

    public Profession() {
    }

    public Profession(String name, String patronymic, String education, String birthday) {
        this.name = name;
        this.patronymic = patronymic;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getEducation() {
        return education;
    }

    public String getBirthday() {
        return birthday;
    }
}
