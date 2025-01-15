package places;

import exceptions.PersonIsAlreadyInPlace;
import people.Person;

import java.util.ArrayList;
import java.util.logging.*;

public class Cabinet extends Place {

    private final static Logger logger = Logger.getLogger(Cabinet.class.getName());

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

    public Cabinet() {
        super("кабинет");
    }

    ArrayList<Person> people = new ArrayList<>();

    public void setPeople(Person... persons) {
        for (Person person : persons) {
            person.setPlace(this);
            people.add(person);
        }
    }

    public void addPersonToCabinet(Person person) {
            people.add(person);
            logger.info(person.getName() + " has entered the " + this.getName());
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
            }
            else {
                logger.warning("Failed to remove " + p.getName() + " from " + this.getName());
            }
        }
    }
}
