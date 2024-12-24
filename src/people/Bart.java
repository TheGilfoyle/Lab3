package people;

import interfaces.Scientist;
import interfaces.WantToTake;

public class Bart extends Person implements Scientist, WantToTake {
    int wishToTake = 0;
    public void take(Object o) {
        System.out.println("Хочет забрать " + o);
    }

}
