package people;

import animals.Animal;
import enums.ResultsOfBoardOfDirectors;
import interfaces.Scientist;
import interfaces.WaitingPerson;
import interfaces.WantToTake;

import static enums.Mood.*;

public class Bart extends Person implements Scientist, WantToTake, WaitingPerson {
    public Bart(String name) {
        super(name);
    }

    @Override
    public void take(Animal mouse) {
        System.out.println("Хочет забрать " + mouse.getName());
    }

    @Override
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
}
