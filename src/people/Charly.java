package people;

import interfaces.NoticeAble;
import interfaces.Scientist;

public class Charly extends Person implements Scientist, NoticeAble {
    @Override
    public void notice() {
        System.out.println("Charly notice smth");
    }

    @Override
    public void report() {
        System.out.println("Charly reports");
    }
}
