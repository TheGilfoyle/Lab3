package places;

import animals.Animal;
import animals.Mouse;
import people.Person;

import java.util.ArrayList;
import java.util.logging.*;

public class Cage extends Place {

    private final static Logger logger = Logger.getLogger(Cage.class.getName());

    static {
        // Удаляем все обработчики по умолчанию
        Logger rootLogger = Logger.getLogger("");
        for (Handler handler : rootLogger.getHandlers()) {
            rootLogger.removeHandler(handler);
        }

        // Создаем новый обработчик консоли
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);

        // Устанавливаем собственный формат
        consoleHandler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return record.getMessage() + System.lineSeparator();
            }
        });

        // Добавляем обработчик к логгеру
        logger.addHandler(consoleHandler);
        logger.setUseParentHandlers(false);
    }

    public Cage(String name) {
        super("клетка");
    }

    ArrayList<Animal> animals = new ArrayList<>();

    public void setAnimals(Animal... animal) {
        for (Animal a : animal) {
            animals.add(a);
        }
    }

    public void getAnimals() {
        for (Animal a : animals) {
            logger.info(a.getName() + " is in a " + this.getName());
        }
    }

    public void deleteAnimals(Animal... animal) {
        for (Animal a : animal) {
            if (animals.remove(a)) {
                logger.info(a.getName() + " is not in a " + this.getName());
            } else {
                logger.warning("Failed to remove " + a.getName() + " from " + this.getName());
            }
        }
    }
}
