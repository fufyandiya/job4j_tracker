package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int healedTeeth;

    public Dentist(String name, String patronymic, String education,
                   String birthday, int experienceOfHealing, int healedTeeth) {
        super(name, patronymic, education, birthday, experienceOfHealing);
        this.healedTeeth = healedTeeth;
    }

    public int getHealedTeeth() {
        return healedTeeth;
    }

    public void heal(Pacient pacient) {
        System.out.println("У пациента был диагноз - " + pacient.getDiagnosis());
        System.out.println("Пациент вылечен");
        healedTeeth++;
    }
}
