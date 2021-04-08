package person;

import static utils.FileReader.getLinesFromFile;
import static utils.MyMath.getDigitsSum;

public final class Fio {

    private final String lastName;
    private final String firstName;
    private final String middleName;

    private Fio(final String lastName, final String firstName, final String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    /**
     * ФИО берутся из соответствующих файлов по индексу в листе:
     * Фамилия - сумма цифр в коде
     * Имя - сумма первых двух цифр
     * Отчество - сумма последних двух цифр.
     *
     * @param code код для генерации
     * @return new Fio - ФИО из списков
     */

    public static Fio getFio(final int code) {
        final int lastNameIndex = getDigitsSum(code);
        final String sex = (lastNameIndex % 2 == 0) ? "f" : "m";
        String lastName = getLinesFromFile("lastNames_" + sex).get(lastNameIndex);
        String firstName = getLinesFromFile("names_" + sex).get(getDigitsSum(code / 100));
        String middleName = getLinesFromFile("middleNames_" + sex).get(getDigitsSum(code % 100));
        return new Fio(lastName, firstName, middleName);
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }


}

