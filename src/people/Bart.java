package people;

import interfaces.Scientist;

public class Bart extends Person implements Scientist {
    public void take(Object o) {
        System.out.println("Хочет забрать " + o);
    }
}
