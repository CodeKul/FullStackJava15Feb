package java8;

import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
        System.out.println(System.currentTimeMillis());

        Date date1 = new Date(1618635854652L);
        System.out.println(date1);
    }
}
