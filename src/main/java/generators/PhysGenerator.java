package generators;

import person.Physical;

public class PhysGenerator extends Generator<Physical> {

    /**
     * Физические параметры генерируются по второй цифре кода:
     * Возраст: 10..100
     * Вес: 30..120 кг
     * Рост: 1..1,9 м.
     */

    @Override
    protected Physical develop(int code) {
        final int i = code % 1000 / 100;
        int age = (i + 1) * 10;
        int weight = 30 + i * 10;
        double height = (100 + i * 10) / 100.00;
        return new Physical(age, weight, height);
    }
}
