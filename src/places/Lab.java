package places;

import animals.Mouse;
import people.Person;

import java.util.ArrayList;
import java.util.logging.*;

public class Lab extends Place {
    private final static Logger logger = Logger.getLogger(Lab.class.getName());

    static {
        Logger rootLogger = Logger.getLogger("");
        for (Handler handler : rootLogger.getHandlers()) {
            rootLogger.removeHandler(handler);
        }

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);

        consoleHandler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return record.getMessage() + System.lineSeparator();
            }
        });

        logger.addHandler(consoleHandler);
        logger.setUseParentHandlers(false);
    }

    public Lab() {
        super("лаборатория");
    }

    public Lab(String name) {
        super.setName(name);
    }

    ArrayList<Person> people = new ArrayList<>();

    public void setPeople(Person... person) {
        for (Person p : person) {
            people.add(p);
        }
    }

    public void getPeople() {
        for (Person p : people) {
            logger.info(p.getName() + " is in a " + this.getName());
        }
    }

    public void deletePeople(Person... person) {
        for (Person p : person) {
            if (people.remove(p)) {
                logger.info(p.getName() + " is not in a " + this.getName());
            } else {
                logger.warning("Failed to remove " + p.getName() + " from " + this.getName());
            }
        }
    }
}
