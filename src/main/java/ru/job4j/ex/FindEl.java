package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        try {
            for (int i = 0; i < value.length; i++) {
                if (value[i].equals(key)) {
                    rsl = i;
                }
            }
            if (rsl == -1) {
                throw new ElementNotFoundException("There is no key element in string massive");
            }
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] values = new String[] {
                "One", "Two", "Three", "Four", "Five"
        };
        try {
            System.out.println(indexOf(values, "Four"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(indexOf(values, "Fasdasd"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
