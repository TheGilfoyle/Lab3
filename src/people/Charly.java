package people;

import enums.ResultsOfBoardOfDirectors;
import etc.ScientificWork;
import interfaces.NoticeAble;
import interfaces.Report;
import interfaces.Scientist;

import static enums.Mood.*;

public class Charly extends Person implements Scientist, NoticeAble, Report {
    int attention = 0;
    double independence = 1;

    public Charly(String name) {
        super(name);
    }

    @Override
    public void notice() {
        setAttention();
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

    @Override
    public void reportFrom(ScientificWork scientificWork) {
        this.independence = 0.9 * independence;
        this.independence = 1;
    }

    @Override
    public void reportTo(ScientificWork scientificWork) {
        scientificWork.setTime(5);
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
