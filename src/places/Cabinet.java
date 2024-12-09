package places;

import people.Person;

import java.util.ArrayList;

public class Cabinet extends Place {
    public Cabinet() {
        super.setName("кабинет");
    }
    public Cabinet(String name) {
        super.setName(name);
    }

    ArrayList<Person> people = new ArrayList<Person>();

    public void beinCabinet(Person... person) {
        for (Person p : person) {
            people.add(p);
            System.out.println(p.getName() + "is in a" + this.getName());
        }
    }
}
