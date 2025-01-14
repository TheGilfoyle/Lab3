package places;

import people.Person;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Lab extends Place {
    private static final Logger logger = Logger.getLogger(Lab.class.getName());

    public Lab() {
        super("лаборатория");
    }

    public Lab(String name) {
        super.setName(name);
    }

    ArrayList<Person> people = new ArrayList<>();

    public void setPeople(Person... person) {
        for (Person p : person) {
            people.add(p);
        }
    }

    public void getPeople() {
        for (Person p : people) {
            logger.info(p.getName() + " is in a " + this.getName());
        }
    }

    public void deletePeople(Person... person) {
        for (Person p : person) {
            if (people.remove(p)) {
                logger.info(p.getName() + " is not in a " + this.getName());
            } else {
                logger.warning("Failed to remove " + p.getName() + " from " + this.getName());
            }
        }
    }
}
