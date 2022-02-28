package factories;

import loggers.TimeLogger;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeLoggerFactory {

    public TimeLogger getTimeLogger() {
        return new TimeLogger(new SimpleDateFormat("HH:mm"), Calendar.getInstance());
    }
}