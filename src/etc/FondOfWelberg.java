package etc;

import enums.ResultsOfBoardOfDirectors;
import people.Person;

public class FondOfWelberg {
    public void getAnAppealFrom(Person person) {
        person.setScienceLevel(person.getScienceLevel() + 1);
    }

    public class  BoardOfDirectors {
        private ResultsOfBoardOfDirectors result;

        public void setResult(ResultsOfBoardOfDirectors result) {
            this.result = result;
        }

        public ResultsOfBoardOfDirectors getResult() {
            return result;
        }
    }
}

