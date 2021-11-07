package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private int successSurgeries;

    public Surgeon(String name, String patronymic, String education,
                      String birthday, int experienceOfHealing, int successSurgeries) {
        super(name, patronymic, education, birthday, experienceOfHealing);
        this.successSurgeries = successSurgeries;
    }

    public Surgeon(int successSurgeries) {
        this.successSurgeries = successSurgeries;
    }

    public int getSuccessSurgeries() {
        return successSurgeries;
    }

    public void heal(Pacient pacient) {
        System.out.println("У пациента был диагноз - " + pacient.getDiagnosis());
        System.out.println("Пациент вылечен");
        successSurgeries++;
    }
}
