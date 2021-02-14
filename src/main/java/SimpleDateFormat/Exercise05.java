package SimpleDateFormat;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise05 {
    public static void main(String[] args) {

        SimpleDateFormat formater = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss:SSS");
        Date today = new Date();
        String formattedDate = formater.format(today);
        System.out.println(formattedDate);

    }
}
