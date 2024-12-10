package places;

import animals.Animal;

import java.util.ArrayList;
import java.util.Objects;

public class Cage extends Place {

    ArrayList<Animal> animals = new ArrayList<Animal>();

    public void beinCage(Animal... animal) {
        for (Animal a : animal) {
            animals.add(a);
            System.out.println("is in a" + this.getName());
        }
    }
}
