package animals;

import places.Place;

public abstract class Animal {
    private String name;
    private Place place;
    int scared = 0;
    int health = 150;
    int appetite = 0;
    abstract void makeSound();
    abstract void eat();
    public Animal(String name, Place place) {
        this.name = name;
        this.place = place;
    }
    public Animal() {}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public void changePlace(Place place) {
        scare();
    }

    public void setScared(int scared) {
        this.scared = scared;
    }
    public void scare(){
        setScared(getScared()+2);
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
}
