package people;

import animals.Animal;
import enums.Mood;
import enums.ResultsOfBoardOfDirectors;
import etc.ScientificWork;
import exceptions.FallException;
import interfaces.Report;
import interfaces.WaitingPerson;
import places.Place;

import java.util.Objects;

import static enums.Mood.*;

public class Person implements WaitingPerson, Report {
    private String name;
    private Place place;
    private int health = 100;
    private Mood mood = Mood.HAPPY;
    private boolean forgivingAbility = false;
    private int scienceLevel = 0;
    private int scienceExperience = 0;
    private int scienceSuccess = 0;
    private double waitingTime = 0;
    private int attention = 0;
    private double independence = 1;

    public Person(Place place) {
        this.place = place;
    }

    public Person(String name, Place place) {
        this.name = name;
        this.place = place;
    }

    public Person(String name, Place place, Mood mood, boolean forgivingAbility, int scienceLevel) {
        this.name = name;
        this.place = place;
        this.mood = mood;
        this.forgivingAbility = forgivingAbility;
        this.scienceLevel = scienceLevel;
    }

    public Person(String name, Place place, boolean forgivingAbility, int scienceLevel) {
        this.name = name;
        this.place = place;
        this.forgivingAbility = forgivingAbility;
        this.scienceLevel = scienceLevel;
    }

    public Person(String name, Place place, Mood mood, int scienceLevel) {
        this.name = name;
        this.place = place;
        this.mood = mood;
        this.scienceLevel = scienceLevel;
    }

    public Person(String name, Place place, Mood mood, boolean forgivingAbility) {
        this.name = name;
        this.place = place;
        this.mood = mood;
        this.forgivingAbility = forgivingAbility;
    }

    public void setHealth() {
        this.health = this.health - 1;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScienceLevel() {
        return scienceLevel;
    }

    public void setScienceLevel() {
        this.scienceLevel = scienceLevel + 1;
    }

    public void setScienceExperience(int scienceExperience) {
        this.scienceExperience = scienceExperience;
    }

    public int getScienceExperience() {
        return scienceExperience;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Place getPlace() {
        return place;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public Mood getMood() {
        return mood;
    }

    public void setForgivingAbility(boolean forgivingAbility) {
        this.forgivingAbility = forgivingAbility;
    }

    public boolean getForgivingAbility() {
        return forgivingAbility;
    }

    public int getAttention() {
        return attention;
    }

    public void setAttention(int attention) {
        this.attention = attention;
    }

    public void setAttention() {
        this.attention = attention + 1;
    }

    public int getScienceSuccess() {
        return scienceSuccess;
    }

    public void setScienceSuccess(int scienceSuccess) {
        this.scienceSuccess = scienceSuccess;
    }

    public void setWaitingTime(double waitingTime) {
        this.waitingTime = waitingTime;
    }

    @Override
    public double getWaitingTime() {
        return waitingTime;
    }

    // Основные методы
    public void pretend(Mood mood) {
        setMood(mood);
    }

    public void walk() {
        setHealth();
        if (equals(this)) {
            try {
                double random = Math.random();
                if (random > 0.76) {
                    throw new FallException(random);
                }
            } catch (FallException fallException) {
                System.out.println(fallException.getMessage());
            }
        }
    }

    @Override
    public void reportTo(ScientificWork scientificWork) {
        scientificWork.setTime(5);
    }

    @Override
    public void reportFrom(ScientificWork scientificWork) {
        this.independence = 0.9 * independence;
    }

    public void notice() {
        setAttention();
    }

    public void handshake(Person a, Person b) {
        a.setHealth();
        b.setHealth();
    }

    public void take(Animal mouse) {
        setAttention();
        System.out.println("Хочет забрать " + mouse.getName());
    }

    public void letItGo(Animal animal, Place place) {
        animal.changePlace(place);
    }

    public void reactionToDecisionOfBoardOfDirectors(ResultsOfBoardOfDirectors resultsOfBoardOfDirectors) {
        switch (resultsOfBoardOfDirectors) {
            case APPROVED:
                setMood(HAPPY);
            case UNDER_CONSTRUCTION:
                setMood(FRIENDLY);
            case UNAPPROVED:
                setMood(SAD);
        }
    }

    public void doingScientificWork() {
        switch (attention) {
            case 1:
                ScientificWork scientificWork = new ScientificWork();
                scientificWork.enoughTime();
            default:
                break;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, "Чарли");
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
