package Lession3.day1;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateLibrary {
    public static void main(String[] args) {
        System.out.println("Local Date :" + LocalDate.now());


        // one decade
        LocalDate today = LocalDate.now();
        var tomorrow = today.plusDays(1);
        System.out.println("Tomorrow Date : "+tomorrow);
        var oneDecadeAgo = today.minus(1, ChronoUnit.DECADES);
        System.out.println("One Decade Ago : "+oneDecadeAgo);

        // difference of date
       var age = Period.between(LocalDate.of(1995,9,28),LocalDate.now());
        System.out.println("Your Age : "+age);

    }
}
