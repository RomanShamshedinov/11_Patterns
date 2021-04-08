package person;

import person.appearance.Appearance;

public class Person {

    public String id;
    public Fio fio;
    public Physical phys;
    public Appearance appearance;
    public Phone phone;

    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder()
                .append(id).append("\n")
                .append(String.format("%1$s %2$s %3$s", fio.getLastName(), fio.getFirstName(), fio.getMiddleName())).append("\n")
                .append(phys).append("\n")
                .append(appearance).append("\n");
        if (phone != null) {
            sb.append(phone);
        } else {
            sb.append("Телефона нет");
        }
        return sb.toString();
    }
}