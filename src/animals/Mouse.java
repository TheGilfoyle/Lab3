package animals;

import places.Place;
import records.Date;

import java.util.logging.*;

public class Mouse extends Animal {
    private String name;
    public Mouse(String name, Place place) {
        super(name, place);
    }
    public Mouse() {
        super();
    }
    private final static Logger logger = Logger.getLogger(Mouse.class.getName());

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
