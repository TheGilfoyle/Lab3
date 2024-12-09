package places;

import people.Person;

import java.util.ArrayList;

public class Lab extends Place {
    public Lab() {
        super.setName("лаборатория");
    }
    public Lab(String name) {
        super.setName(name);
    }

    ArrayList<Person> people = new ArrayList<Person>();

    public void beinLab(Person... person) {
        for (Person p : person) {
            people.add(p);
            System.out.println(p.getName() + "is in a" + this.getName());
        }
    }
}
