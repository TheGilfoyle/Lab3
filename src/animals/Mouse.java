package animals;

import places.Place;
import records.Date;

import java.util.logging.*;

public class Mouse extends Animal {
    public Mouse(String name, Place place) {
        super(name, place);
    }
    private final static Logger logger = Logger.getLogger(Mouse.class.getName());

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

    void makeSound() {
        logger.info("Пи-пи-пи!");
    }

    @Override
    void eat() {
        if (Math.random() > 0.65) {
            this.setHealth(150);
            makeSound();
        }
        else {
            appetite = appetite + 1;
        }
    }

    @Override
    public void changePlace(Place place) {
        super.changePlace(place);
        makeSound();
    }
}
