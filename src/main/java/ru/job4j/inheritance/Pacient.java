package ru.job4j.inheritance;

public class Pacient {
    private String diagnosis;

    public Pacient(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
}
