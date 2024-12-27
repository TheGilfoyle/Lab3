package animals;

import places.Place;

public abstract class Animal {
    private String name;
    int scared = 0;
    int health = 150;
    abstract void makeSound();
    abstract void eat();
    public Animal(String name) {
        this.name = name;
    }
    public Animal() {}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void changePlace(Place place) {
        scare();
    }

    public void setScared(int scared) {
        this.scared = scared;
    }
    public void scare(){
        scared++;
    }
    public int getScared() {
        return scared;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
    public void isAlive(Animal animal) {
        if (animal.getScared()>=50) animal.setHealth(0);
        System.out.println("Животное умерло");
    }
}
