package people;

import enums.Mood;
import places.Place;

import java.util.Objects;

public abstract class Person {
    private String name;
    private Place place;
    private Mood mood = Mood.GOOD;

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void pretend(Mood mood){
        System.out.println("Сделать вид, что я " + mood);
    }

    public void setPlace(Place place) {this.place = place;}
    public Place getPlace() {return place;}

    public void setMood(Mood mood) {
        this.mood = mood;
    }
    public Mood getMood() {
        return mood;
    }

    public void handshake(Object a, Object b) {
        System.out.println(a + "пожал руку" + b);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(place, person.place) && Objects.equals(mood, person.mood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, place, mood);
    }

    @Override
    public String toString() {
        return this.getClass() +
                "[name='" + name + '\'' +
                ", place=" + place +
                ", mood=" + mood +
                ']';
    }
}
