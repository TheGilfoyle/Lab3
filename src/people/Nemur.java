package people;

import etc.ScientificWork;
import interfaces.Report;
import interfaces.Scientist;

public class Nemur extends Person implements Scientist, Report {
    double independence = 1;
    @Override
    public void reportTo(ScientificWork scientificWork) {
        this.independence = 1;
        scientificWork.setTime(5);
    }
    @Override
    public void reportFrom(ScientificWork scientificWork) {
        this.independence = 0.9 * independence;
    }

}
