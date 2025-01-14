package places;

import java.util.Objects;

public abstract class Place {
    private String name;
    public Place(String name) {
        this.name = name;
    }
    public Place() {
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Place)) return false;
        Place place = (Place) o;
        return Objects.equals(name, place.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String
    toString() {
        return
                "[name='" + name + '\'' +
                ']';
    }
}