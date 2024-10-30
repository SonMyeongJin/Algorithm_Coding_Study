import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        for (int i = 0; i < N / 4; i++) {

            System.out.print("long ");
        }

        System.out.print("int");

    }
}
