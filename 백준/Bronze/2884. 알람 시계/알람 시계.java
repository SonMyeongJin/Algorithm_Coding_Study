import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

        int minute = (a * 60 + b);

        int alarm = (minute - 45);


        int alarmHour = 0;
        int alarmMinute = 0;

        if (alarm < 0) {
            alarmHour = 23;
            alarmMinute = 60 + alarm;
        }
        else if (alarm > 0) {
            alarmHour = alarm / 60;
            alarmMinute = alarm % 60;
        }

        System.out.println(alarmHour);
        System.out.println(alarmMinute);
    }
}
