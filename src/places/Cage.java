package places;

import animals.Animal;

import java.util.ArrayList;

public class Cage extends Place {

    ArrayList<Animal> animals = new ArrayList<>();

    public Cage(String name) {
        super(name);
    }

    public void beInCage(Animal... animal) {
        for (Animal a : animal) {
            animals.add(a);
            System.out.println(a.getName()+ " is in a " + this.getName());
        }
    }
}
