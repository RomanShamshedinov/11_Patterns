package person;

import static utils.FileReader.getLinesFromFile;
import static utils.MyMath.getDigitsSum;

public class Fio {

    final private String lastName;
    final private String firstName;
    final private String middleName;

    private Fio(String lastName, String firstName, String middleName){
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
     */

    public static Fio getFio(final int code) {
        final int lastNameIndex = getDigitsSum(code);
        final String sex = (lastNameIndex % 2 == 0) ? "f" : "m";
        String lastName = getLinesFromFile("lastNames_" + sex).get(lastNameIndex);
        String firstName = getLinesFromFile("names_" + sex).get(getDigitsSum(code / 100));
        String middleName = getLinesFromFile("middleNames_" + sex).get(getDigitsSum(code % 100));
        return new Fio(lastName, firstName, middleName);
    }

    public final String getLastName() {
        return lastName;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final String getMiddleName() {
        return middleName;
    }


}

