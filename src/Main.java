import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws ParseException {

        String myBirthday = "25 April 1986";
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
        Date birthDate = formatter.parse(myBirthday);
        String output = formatter.format(birthDate);
        System.out.println(output);

    }
}
