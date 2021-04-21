package java8;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
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

        ZoneId zoneId = ZoneId.of("America/Los_Angeles");
        System.out.println(zoneId);

        LocalDate localDate3 = LocalDate.now(zoneId);
        System.out.println(localDate3);
        LocalTime localTime = LocalTime.now(zoneId);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

//        LocalDate from  = LocalDate.of(2020,4,20);
//        LocalDate to  = LocalDate.of(2020,4,22);
//
//        Period period = Period.between(from,to);
//        System.out.println(period.getDays());
//        System.out.println(period.getYears());
//        System.out.println(period.getMonths());

        LocalDateTime from = LocalDateTime.of(2020,4,20,5,20,30);
        LocalDateTime to = LocalDateTime.of(2020,4,21,10,20,30);

        Duration duration = Duration.between(from,to);
        System.out.println(duration.toHours());
        System.out.println(duration.toDays());
        System.out.println(duration.toMinutes());

        long days = ChronoUnit.DAYS.between(from,to);
        long min = ChronoUnit.MINUTES.between(from,to);
        long mill = ChronoUnit.MILLIS.between(from,to);
        System.out.println(days);
        System.out.println(min);
        System.out.println(mill);

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yy");
        String str = format.format(date);
        System.out.println(str);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String localFor = localDate.format(dateTimeFormatter);
        System.out.println(localFor);

    }
}
