package places;

import people.Person;

import java.util.ArrayList;

public class Cabinet extends Place {
    public Cabinet(String name) {
        super.setName(name);
    }

    ArrayList<Person> people = new ArrayList<>();

    public void setPeople(Person... person) {
        for (Person p : person) {
            people.add(p);
            System.out.println(p.getName() + " is in a " + this.getName());
        }
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void deletePeople(Person... person) {
        for (Person p : person) {
            people.remove(p);
            System.out.println(p.getName() + " is not in a " + this.getName());
        }
    }
}
