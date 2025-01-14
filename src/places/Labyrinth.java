package places;

import animals.Animal;
import people.Person;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Labyrinth extends Place {
    private int level;

    private static final Logger logger = Logger.getLogger(Labyrinth.class.getName());

    public Labyrinth(int level) {
        super("Лабиринт");
        this.level = level;
    }
    public double timePath(){
        if (level > 6){
            return level*6 +9;
        }
        else{
            return level * 4 + 1;
        }
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
