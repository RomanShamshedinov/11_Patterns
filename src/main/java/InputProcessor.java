import generators.AppearanceGenerator;
import person.Fio;
import generators.PhoneGenerator;
import generators.PhysGenerator;
import person.Person;
import person.PersonBuilder;

public class InputProcessor {

    public final String processInput(final String input) {

        if (input.trim().matches("\\d{4}")) {

            PersonBuilder builder = new PersonBuilder(input);
            AppearanceGenerator app = new AppearanceGenerator();
            PhysGenerator phys = new PhysGenerator();
            PhoneGenerator phone = new PhoneGenerator();

            final int intCode = Integer.parseInt(input);
            builder.withFio(Fio.getFio(intCode));
            builder.withPhys(phys.createItem(intCode));
            builder.withAppearance(app.createItem(intCode));
            builder.withPhone(phone.createItem(intCode));

            Person person = builder.build();
            return person.toString();
        } else {
            return "Неверный ввод.";
        }
    }
}
