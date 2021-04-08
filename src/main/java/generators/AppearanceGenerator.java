package generators;

import person.appearance.Appearance;
import person.appearance.EyesColor;
import person.appearance.hair.Hair;

import java.util.HashMap;

public class AppearanceGenerator extends Generator<Appearance> {

    /**
     * Внешность генерируется по третьей цифре кода (i):
     * Глаза: по индексу i/2 (=0..4)
     * Длина волос: i
     * Цвет волос: из enum по индексу i-1 при i>0 (=0..8).
     */

    @Override
    protected Appearance develop(int code) {
        final int i = code % 100 / 10;
        String eyes = EyesColor.getColorEyes(i);
        Hair hair = new Hair(Hair.getColor(i), i);
        return new Appearance(eyes, hair);
    }
}

