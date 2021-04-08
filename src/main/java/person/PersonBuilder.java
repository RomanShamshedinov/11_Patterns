package person;

import person.appearance.Appearance;

public class PersonBuilder {
    private final String id;
    private Fio fio;
    private Physical phys;
    private Appearance appearance;
    private Phone phone;

    public PersonBuilder(final String id) {
        this.id = id;
    }

    public final void withFio(final Fio fios) {
        this.fio = fios;
    }

    public final void withPhys(final Physical physs) {
        this.phys = physs;
    }

    public final void withAppearance(final Appearance appearences) {
        this.appearance = appearences;
    }

    public final void withPhone(final Phone phones) {
        this.phone = phones;
    }

    public final Person build() {
        final Person person = new Person();
        person.id = this.id;
        person.fio = this.fio;
        person.phys = this.phys;
        person.appearance = this.appearance;
        person.phone = this.phone;

        return person;
    }
}
