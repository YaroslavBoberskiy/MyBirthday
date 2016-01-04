import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws ParseException {

        String myBirthday = "25 April 1986";
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
        Date birthDate = formatter.parse(myBirthday);
        String output = formatter.format(birthDate);
        System.out.println(output);

        // Day of week of my Birthday

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(birthDate);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

    }
}
