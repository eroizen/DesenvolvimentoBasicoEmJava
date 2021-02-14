package ClassDate;

import java.util.Date;

public class Exercise03 {
    public static void main(String[] args) {
        boolean compare;
        long niverMils;
        long givenMils;
        Date niver = new Date(1982,10,12);
        Date given = new Date(2010,04,15);
        niverMils = niver.getTime();
        givenMils = given.getTime();
        Date niverDate = new Date(niverMils);
        Date givenDate = new Date(givenMils);
        compare = niver.before(given);

        if (compare){
            System.out.println("A data do aniversário é anterior a data de 15 de maio de 2010");
            System.out.println("NiverMils "+niverMils+" | "+ niverDate);
            System.out.println("GivenMils: "+givenMils+" | "+ givenDate);
        }
        else
        {
            System.out.println("a data do aniversário é posterior a data de 15 de maio de 2010");
            System.out.println("NiverMils "+niverMils+" | "+ niverDate);
            System.out.println("GivenMils: "+givenMils+" | "+ givenDate);
        }
    }
}