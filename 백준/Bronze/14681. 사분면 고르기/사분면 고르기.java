import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

        if (a>0 && b>0) {
            System.out.println("1");
        } else if (a > 0 && b < 0) {
            System.out.println("4");
        } else if (a< 0 && b > 0) {
            System.out.println("2");
        } else if (a < 0 && b < 0) {
            System.out.println("3");
        }
    }
}
