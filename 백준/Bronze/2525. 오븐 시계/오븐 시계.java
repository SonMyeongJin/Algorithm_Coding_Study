import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int hour = scn.nextInt();
        int minute = scn.nextInt();
        int add = scn.nextInt();

        int total = (hour * 60 + minute) + add ;

        int totalHour = 0;
        int totalMinute = 0;

        if (total < 0) {
            totalHour = 23;
            totalMinute = 60 + total;
        }
        else if (total > 0) {
            totalHour = (total / 60) % 24;
            totalMinute = total % 60;
        }

        System.out.println(totalHour);
        System.out.println(totalMinute);
    }
}
