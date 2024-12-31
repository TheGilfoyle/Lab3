package places;

import animals.Animal;
import people.Person;

import java.util.ArrayList;

public class Labyrinth extends Place {
    private int level;
    private String name;
    public Labyrinth(String name, int level) {
        this.name = name;
        this.level = level;
    }
    double timePath(){
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
            System.out.println("is in a" + this.getName());
        }
    }

    public void deleteAnimals(Animal... animal) {
        for (Animal a : animal) {
            animals.remove(a);
            System.out.println("is in a" + this.getName());
        }
    }
}
