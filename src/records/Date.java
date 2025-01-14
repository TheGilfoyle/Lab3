package records;

import enums.Month;

import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
public record Date(int day, Month month) {
    private final static Logger logger = Logger.getLogger(Date.class.getName());

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

    public void print() {
        logger.info(String.format("%d %s", day, month));
    }
}
