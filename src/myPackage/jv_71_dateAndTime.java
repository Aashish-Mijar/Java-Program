package myPackage;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class jv_71_dateAndTime {
    public static void main(String[] args) {
        // (localDate, localtime, localDateTime, UTC timestamp)
        // Custom format

//        LocalDate date= LocalDate.now();
//        LocalTime time=LocalTime.now();
//        LocalDateTime localDtime=LocalDateTime.now();
//        Instant instant = Instant.now();
//        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        String newDateTime=localDtime.format(formatter);
//        System.out.println("Date and Time: "+newDateTime);


//        System.out.println(date);
//        System.out.println(time);
//        System.out.println(localDtime);
//        System.out.println(instant);

        LocalDate date=LocalDate.of(2025, 4, 23);
        LocalDateTime date2=LocalDateTime.of(2025, 4, 23, 9, 7, 34);
        System.out.println(date2);
        System.out.println(date);

    }
}
