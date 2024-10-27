import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int price = 0;

        if (a == b && b == c && a == c) {
            price = 10000 + a * 1000;
        } else if (a == b || b == c) {
            price = 1000 + b * 100;
        } else if (a == c) {
            price = 1000 + c * 100;
        } else {
            if ( a> b && a> c ) {
                price = a * 100;
            }else if ( b > c && b > a ) {
                price = b * 100;
            }else if ( c > a ) {
                price = c * 100;
            }
        }

        System.out.println(price);
    }
}
