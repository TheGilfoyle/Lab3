package people;

import enums.ResultsOfBoardOfDirectors;
import etc.ScientificWork;
import interfaces.Report;
import interfaces.Scientist;

import static enums.Mood.*;

public class Nemur extends Person implements Scientist, Report {
    double independence = 1;
    public Nemur(String name) {
        super(name);
    }
    @Override
    public void reportTo(ScientificWork scientificWork) {
        this.independence = 1;
        scientificWork.setTime(5);
    }
    @Override
    public void reportFrom(ScientificWork scientificWork) {
        this.independence = 0.9 * independence;
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
