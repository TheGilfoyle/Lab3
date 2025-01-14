package places;

import animals.Animal;
import people.Person;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Cage extends Place {

    private static final Logger logger = Logger.getLogger(Cage.class.getName());

    public Cage(String name) {
        super("клетка");
    }

    ArrayList<Animal> animals = new ArrayList<>();

    public void setAnimals(Animal... animal) {
        for (Animal a : animal) {
            animals.add(a);
        }
    }

    public void getAnimals() {
        for (Animal a : animals) {
            logger.info(a.getName() + " is in a " + this.getName());
        }
    }

    public void deleteAnimals(Animal... animal) {
        for (Animal a : animal) {
            if (animals.remove(a)) {
                logger.info(a.getName() + " is not in a " + this.getName());
            } else {
                logger.warning("Failed to remove " + a.getName() + " from " + this.getName());
            }
        }
    }
}
