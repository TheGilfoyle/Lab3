package enums;

import people.Person;

public enum Mood {
    HAPPY,
    DISSATISFIED,
    SAD,
    FRIENDLY;

    public Mood getMood(Person person) {
        return person.getMood();
    }
}
