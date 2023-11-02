package Practice.TempA;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Instant instant = Instant.now();

        String input = sc.nextLine();
        System.out.println("ISO 8601 형식으로 표현된 UTC 날짜 및 시간: "+formattedDate);
        System.out.println("저장된 UTC 날짜 및 시간: "+savedInstant);
        System.out.println("-----------------------");
    }
}
