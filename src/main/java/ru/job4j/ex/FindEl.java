package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] values, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("There is no key element in string massive");
        }
        return rsl;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (ElementAbuseException ea) {
            ea.printStackTrace();
        } catch (ElementNotFoundException en) {
            en.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
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
