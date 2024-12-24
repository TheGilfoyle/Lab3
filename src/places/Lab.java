package places;

import java.util.ArrayList;
import java.util.Objects;

public class Lab extends Place {
    public Lab() {
        super.setName("лаборатория");
    }
    public Lab(String name) {
        super.setName(name);
    }

    ArrayList<Objects> creatures = new ArrayList<>();

    public void beinLab(Objects... objects) {
        for (Objects p : objects) {
            creatures.add(p);
            System.out.println("is in a" + this.getName());
        }
    }
}
