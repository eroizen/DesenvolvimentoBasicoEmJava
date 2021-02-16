package LocalDateTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Exercise06 {
    public static void main(String[] args) {
        LocalDateTime given = LocalDateTime.of(2010, 5,15,10, 0, 0);
        LocalDateTime future = given.plusYears(4).plusMonths(6).plusHours(13);

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Given date: "+given.format(pattern));
        System.out.println("Future date: "+future.format(pattern));
    }
}
