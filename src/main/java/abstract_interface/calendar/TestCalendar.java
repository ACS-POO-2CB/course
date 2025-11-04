package abstract_interface.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
        // Construct a Gregorian calendar for the current date and time
        Calendar calendar = new GregorianCalendar();
        System.out.println("Current time is " + new Date());
        System.out.println("YEAR:\t" + calendar.get(Calendar.YEAR));
        System.out.println("MONTH:\t" + calendar.get(Calendar.MONTH));
        System.out.println("DATE:\t" + calendar.get(Calendar.DATE));
        System.out.println("HOUR:\t" + calendar.get(Calendar.HOUR));
        System.out.println("HOUR_OF_DAY:\t" + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("MINUTE:\t" + calendar.get(Calendar.MINUTE));
        System.out.println("SECOND:\t" + calendar.get(Calendar.SECOND));
        System.out.println("DAY_OF_WEEK:\t" + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY_OF_MONTH:\t" + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));

        Calendar calendar1 = new GregorianCalendar(2020, Calendar.JANUARY, 1);
        calendar1.add(Calendar.MONTH, -1);
        calendar1.add(Calendar.YEAR, 6);
        System.out.println(calendar1.getTime() + " is a " + dayNameOfWeek(calendar1.get(Calendar.DAY_OF_WEEK)) + " :D");
    }

    public static String dayNameOfWeek(int dayOfWeek) {
        String output;
        switch (dayOfWeek) {
            case 1 -> output = "Sunday";
            case 2 -> output = "Monday";
            case 3 -> output = "Tuesday";
            case 4 -> output = "Wednesday";
            case 5 -> output = "Thursday";
            case 6 -> output = "Friday";
            case 7 -> output = "Saturday";
            default -> output = null;
        }
        return output;
    }
}