package places;

import animals.Animal;

import java.util.ArrayList;

public class Labyrinth extends Place {
    private int level;
    public Labyrinth(String name, int level) {
        super(name);
        this.level = level;
    }
    double timePath(){
        if (level > 6){
            return Math.random()*6 +9;
        }
        else{
            return Math.random() * 4 + 1;
        }
    }
    ArrayList<Animal> animals = new ArrayList<>();

    public void beInLabyrinth(Animal... animal) {
        for (Animal a : animal) {
            animals.add(a);
            System.out.println("is in a" + this.getName());
        }
    }
}
