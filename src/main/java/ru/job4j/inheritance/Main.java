package ru.job4j.inheritance;

public class Main {
    public static void main(String[] args) {
        Pacient ivan = new Pacient("Зубная боль");
        Dentist fedor = new Dentist("Федор", "Петрович", "МГУ", "16.07.1980",
                20, 150);
        System.out.println("До лечения пациента стоматолог "
                + fedor.getName() + " " + fedor.getPatronymic()
                + " вылечил: " + fedor.getHealedTeeth() + " зуб(ов)");
        fedor.heal(ivan);
        System.out.println("После лечения пациента стоматолог "
                + fedor.getName() + " " + fedor.getPatronymic()
                + " вылечил: " + fedor.getHealedTeeth() + " зуб(ов)");
        System.out.println();
        Pacient maria = new Pacient("Перитонит");
        Surgeon alla = new Surgeon("Алла", "Васильевна", "СПБГУ", "22.12.1975",
                35, 86);
        System.out.println("До лечения пациента хирург "
                + alla.getName() + " " + alla.getPatronymic()
                + " провел(а): " + alla.getSuccessSurgeries() + " успешных операций");
        alla.heal(maria);
        System.out.println("После лечения пациента хирург "
                + alla.getName() + " " + alla.getPatronymic()
                + " провел(а): " + alla.getSuccessSurgeries() + " успешных операций");
        System.out.println();
        Programmer mark = new Programmer("Марк", "Цукерберг", "Калифорния",
                "10.03.1984", 15, 23);
        Program program = new Program("facebook");
        System.out.println("До создания программы "
                + mark.getName() + " " + mark.getPatronymic()
                + " создал: " + mark.getCompletedProgramms() + " программ(ы)");
        mark.createProgram(program);
        System.out.println("После создания программы "
                + mark.getName() + " " + mark.getPatronymic()
                + " создал: " + mark.getCompletedProgramms() + " программ(ы)");
        System.out.println();
        Builder anton = new Builder("Антон", "Иванович", "ВГУ", "10.03.1997",
                3, 4);
        Building building = new Building("АЭС");
        System.out.println("До проектирования здания "
                + anton.getName() + " " + anton.getPatronymic()
                + " спроектировал: " + anton.getProjectedBuildings() + " здания(й)");
        anton.createBuilding(building);
        System.out.println("После проектирования здания "
                + anton.getName() + " " + anton.getPatronymic()
                + " спроектировал: " + anton.getProjectedBuildings() + " здания(й)");
    }
}
