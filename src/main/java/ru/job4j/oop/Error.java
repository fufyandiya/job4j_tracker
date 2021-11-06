package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error(true, 144, "ошибка 144");
        error.printInfo();
        Error error2 = new Error();
        error2.printInfo();
    }

    public void printInfo() {
        System.out.println("Ошибка в данный момент: " + this.active);
        System.out.println("Код ошибки: " + this.status);
        System.out.println("Сообщение: " + this.message);
    }
}
