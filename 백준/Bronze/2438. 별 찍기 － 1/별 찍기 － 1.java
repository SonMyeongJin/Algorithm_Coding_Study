import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();

        for (int i = 1; i < a+1; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}