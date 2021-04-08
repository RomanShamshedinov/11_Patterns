package person;

import person.appearance.Appearance;

public class PersonBuilder {
    private String id;
    private Fio fio;
    private Physical phys;
    private Appearance appearance;
    private Phone phone;

    public PersonBuilder(String id){
        this.id = id;
    }

    public void withFio(Fio fio){
        this.fio = fio;
    }

    public void withPhys(Physical phys){
        this.phys = phys;
    }

    public void withAppearance(Appearance appearence){
        this.appearance = appearence;
    }

    public void withPhone(Phone phone){
        this.phone = phone;
    }

    public Person build(){
        final Person person = new Person();
        person.id = this.id;
        person.fio = this.fio;
        person.phys = this.phys;
        person.appearance = this.appearance;
        person.phone = this.phone;

        return person;
    }
}
