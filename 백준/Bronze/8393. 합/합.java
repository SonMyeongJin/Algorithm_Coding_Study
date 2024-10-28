import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int total = 0;

        for (int i = 0; i <= n; i++) {
            total += i;
        }

        System.out.println(total);
    }
}
