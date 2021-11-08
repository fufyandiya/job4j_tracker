package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private int completedProgramms;

    public Programmer(String name, String patronymic, String education,
                    String birthday, int experienceOfEngineering, int completedProgramms) {
        super(name, patronymic, education, birthday, experienceOfEngineering);
        this.completedProgramms = completedProgramms;
    }

    public int getCompletedProgramms() {
        return completedProgramms;
    }

    public void createProgram(Program program) {
        System.out.println("Программист создаёт: " + program.getName());
        System.out.println("Программа создана");
        completedProgramms++;
    }
}
