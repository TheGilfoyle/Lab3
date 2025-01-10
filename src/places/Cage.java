package places;

import animals.Animal;
import people.Person;

import java.util.ArrayList;

public class Cage extends Place {

    public Cage(String name) {
        super(name);
    }

    ArrayList<Animal> animals = new ArrayList<>();

    public void setAnimals(Animal... animal) {
        for (Animal a : animal) {
            a.setPlace(this);
        }
    }

    public void getAnimals() {
        for (Animal a : animals) {
            System.out.println(a.getName() + " is in a " + this.getName());
        }
    }

    public void deleteAnimals(Animal... animal) {
        for (Animal a : animal) {
            animals.remove(a);
            System.out.println("is not in a" + this.getName());
        }
    }
}
