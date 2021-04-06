package ex7;


import java.time.*;

public class Date {

public static void main(String[] args)
    {
        LocalDate date = LocalDate.of(1998, 9, 12);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(date, now);
 
     System.out.printf("\nDifference: %d years, %d months and %d days old\n\n",
                    diff.getYears(), diff.getMonths(), diff.getDays());
  }


}