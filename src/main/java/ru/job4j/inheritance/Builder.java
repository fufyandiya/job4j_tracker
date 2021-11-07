package ru.job4j.inheritance;

public class Builder extends Engineer {
    private int projectedBuildings;

    public Builder(String name, String patronymic, String education,
                      String birthday, int experienceOfEngineering, int builtBuildings) {
        super(name, patronymic, education, birthday, experienceOfEngineering);
        this.projectedBuildings = builtBuildings;
    }

    public Builder(int builtBuildings) {
        this.projectedBuildings = builtBuildings;
    }

    public int getProjectedBuildings() {
        return projectedBuildings;
    }

    public void createBuilding(Building building) {
        System.out.println("Строитель проектирует: " + building.getName());
        System.out.println("Строение спроектировано");
        projectedBuildings++;
    }
}
