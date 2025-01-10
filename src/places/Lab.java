package places;

import people.Person;

import java.util.ArrayList;
import java.util.Objects;

public class Lab extends Place {
    public Lab() {
        super.setName("лаборатория");
    }
    public Lab(String name) {
        super.setName(name);
    }

    ArrayList<Person> people = new ArrayList<>();

    public void setPeople(Person... person) {
        for (Person p : person) {
            p.setPlace(this);
        }
    }

    public void getPeople() {
        for (Person p : people) {
            System.out.println(p.getName() + " is in a " + this.getName());
        }
    }

    public void deletePeople(Person... person) {
        for (Person p : person) {
            people.remove(p);
            System.out.println(p.getName() + " is not in a " + this.getName());
        }
    }
}
