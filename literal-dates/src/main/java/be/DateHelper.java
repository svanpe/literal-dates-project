package be;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * TODO Document this class.
 * 
 * @author 7518379 [YourFullNameHere]
 */
public class DateHelper {

    public static Map<String, Long> context = new HashMap<String, Long>();

    public static long addVariable(String name, long value) {
        context.put(name, value);
        
        return value;
    }

    static long today = Calendar.getInstance().getTimeInMillis();
    
    public static long getVariable(String name) {

        if (!context.containsKey(name)) {
            throw new IllegalArgumentException(name + " is unknown in the context");
        }

        return context.get(name);
    }

    public static void clearContext() {
        context.clear();
    }

    public static void setToday(long today) {
    
    	DateHelper.today = today;
    }
    
    public static long today() {
        return today;
    }

    public static long tomorrow() {
        Calendar cal = Calendar.getInstance();

        cal.setTimeInMillis(today());
        cal.roll(Calendar.DATE, true);

        return cal.getTimeInMillis();
    }

    public static long yesterday() {
        Calendar cal = Calendar.getInstance();

        cal.setTimeInMillis(today());
        cal.roll(Calendar.DATE, false);

        return cal.getTimeInMillis();
    }

    public static long parseDate(String date) {

        date = date.replace("-", "/");
        
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        try {
            return df.parse(date).getTime();
        } catch (ParseException e) {

            throw new RuntimeException("cant parse date " + date + " - format must be dd/MM/yyyy", e);

        }

    }

    public static long addPeriod(long start, String value, boolean add) {

        Pattern p = Pattern.compile("[A-Za-z]+|\\d+");
        Matcher m = p.matcher(value);
        ArrayList<String> allMatches = new ArrayList<String>();
        while (m.find()) {
            allMatches.add(m.group().trim());
        }

        String stPeriodValue = allMatches.get(0);
        String stPeriodType = allMatches.get(1);

        Calendar cal = Calendar.getInstance();

        if (start != -1) {
            cal.setTimeInMillis(start);
        }

        int period = Calendar.DATE;

        if ("weeks".compareToIgnoreCase(stPeriodType) == 0 || "week".compareToIgnoreCase(stPeriodType) == 0 || "w".compareToIgnoreCase(stPeriodType) == 0) {
            period = Calendar.WEEK_OF_YEAR;

        } else if ("months".compareToIgnoreCase(stPeriodType) == 0 || "month".compareToIgnoreCase(stPeriodType) == 0 || "m".compareToIgnoreCase(stPeriodType) == 0) {
            period = Calendar.MONTH;

        } else if ("years".compareToIgnoreCase(stPeriodType) == 0 || "year".compareToIgnoreCase(stPeriodType) == 0 || "y".compareToIgnoreCase(stPeriodType) == 0) {
            period = Calendar.YEAR;

        } else if ("days".compareToIgnoreCase(stPeriodType) == 0 || "day".compareToIgnoreCase(stPeriodType) == 0 || "d".compareToIgnoreCase(stPeriodType) == 0) {
            period = Calendar.DATE;

        } else {
            throw new IllegalArgumentException(stPeriodType + " is an unknown period type.");

        }

        if (add) {
            cal.add(period, Integer.parseInt(stPeriodValue));
        } else {
            cal.add(period, -Integer.parseInt(stPeriodValue));
        }

        return cal.getTimeInMillis();
    }
}
