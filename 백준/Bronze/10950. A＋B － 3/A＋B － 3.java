import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt(); 
        int[] a = new int[T];

        for (int i = 0; i < T; i++) {
            int A = scn.nextInt();
            int B = scn.nextInt();
            a[i] = A+B;
        }

        for (int i = 0; i < T; i++) {
            System.out.println(a[i]);
        }
    }
}
