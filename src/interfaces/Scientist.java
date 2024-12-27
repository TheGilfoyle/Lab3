package interfaces;

import enums.ResultsOfBoardOfDirectors;
import etc.ScientificWork;
import people.Person;
import static enums.Mood.*;

public interface Scientist {
    default void solveSquareEquation() {}
    default void report() {}
    default void reactionToDecisionOfBoardOfDirectors(ResultsOfBoardOfDirectors resultsOfBoardOfDirectors) {}
    default boolean timeSpendForScientistWork(ScientificWork scientificWork) {
        return switch ((int) scientificWork.getTime()) {
            case 0, 1, 2, 3, 4, 5 -> true;
            default -> false;
        };
    }
    default void success(ScientificWork scientificWork, Person person) {
        person.setMood(scientificWork.getSuccess() ? HAPPY : SAD);
        person.setScienceLevel();
        person.setScienceExperience(person.getScienceExperience() + (int) (10 * Math.random()));
    }
}
