/*
A client have 10 days after the expiration date to pay a bill without fees.
The client can pay the bill on Monday if this day is an Saturday or Sunday.
Create a structure that receives an expiration date and calculates how many days the client have to pay the bill without fees.
*/
package VencimentoFatura;

import java.util.Calendar;
import static java.time.temporal.ChronoUnit.DAYS;

public class Exercise04 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();

        Calendar expiration = Calendar.getInstance();
        expiration.set(2021,Calendar.MARCH,5,15,30, 0);//Expiration Date

        Calendar noFees = (Calendar) expiration.clone();
        noFees.add(Calendar.DATE,10);//No fees until 10 days after expiration date.

        int diaFinal= noFees.get(Calendar.DAY_OF_WEEK);

        if(diaFinal==1){ //Domingo
            noFees.add(Calendar.DATE,1);
        }
        else if(diaFinal==7){ //Sábado
            noFees.add(Calendar.DATE,2);
        }

        long untilExp=DAYS.between(today.toInstant(), expiration.toInstant());
        long untilFees=DAYS.between(today.toInstant(), noFees.toInstant());

        System.out.println("You have "+untilExp+" days until the expiration date and "+untilFees+" days to pay without fees.");

        //Another way to calculate the number of days. Now just calculating with milliseconds.
        long todayMillis = today.getTimeInMillis();
        long expMillis = expiration.getTimeInMillis();
        long noFeesMillis = noFees.getTimeInMillis();

        int diasVenc = (int) ((expMillis - todayMillis) / (24 * 60 * 60 * 1000));
        int diasSemMulta = (int) ((noFeesMillis - todayMillis)/(24 * 60 * 60 * 1000));

        System.out.println("Days to expiration: "+diasVenc+" days. | Fees after: "+diasSemMulta+" days.");
    }
}