package records;

import enums.Month;

import java.util.logging.Logger;

public record Date(int day, Month month) {
    private final static Logger logger = Logger.getLogger(Date.class.getName());
    public void print() {
        logger.info(day + " " + month);
    }
}
