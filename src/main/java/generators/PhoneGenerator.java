package generators;

import person.Phone;
import utils.MyMath;

import java.util.Random;

public class PhoneGenerator extends Generator<Phone> {

    /**
     * Номер телефона генерируется следующим образом:
     * +79[сумма цифр в коде][3 случайных числа][код].
     */
    @Override
    protected Phone develop(final int code) {
        String sCode = String.valueOf(code);
        if (!(sCode.equals(new StringBuilder(sCode).reverse().toString()))) {
            String number = "+79"
                    + String.format("%02d", MyMath.getDigitsSum(code))
                    + String.format("%03d", new Random().nextInt(1000))
                    + String.format("%04d", code);
            return new Phone(number);
        }
        return null;
    }
}

