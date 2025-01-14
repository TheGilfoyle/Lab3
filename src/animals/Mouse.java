package animals;

import places.Place;

import java.util.logging.Logger;

public class Mouse extends Animal {
    private String name;
    public Mouse(String name, Place place) {
        super(name, place);
    }
    public Mouse() {
        super();
    }
    private static final Logger logger = Logger.getLogger(Animal.class.getName());

    void makeSound() {
        logger.info("Пи-пи-пи!");
    }

    @Override
    void eat() {
        if (Math.random() > 0.65) {
            this.setHealth(150);
            makeSound();
        }
        else {
            appetite = appetite + 1;
        }
    }

    @Override
    public void changePlace(Place place) {
        super.changePlace(place);
        makeSound();
    }
}
