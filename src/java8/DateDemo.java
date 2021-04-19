package java8;

import java.time.LocalDate;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
        System.out.println(System.currentTimeMillis());

        Date date1 = new Date(1618635854652L);
        System.out.println(date1);

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.now().minusDays(1);
        LocalDate localDate2 = LocalDate.now().plusDays(1);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getDayOfMonth());

        System.out.println(localDate1.isAfter(localDate));

    }
}
