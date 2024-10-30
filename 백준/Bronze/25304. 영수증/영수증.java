import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int total = scn.nextInt();
        int number = scn.nextInt();
        int[] index = new int[number];
        int[] price = new int[number];

        int sum = 0;
        for (int i = 0; i < number; i++) {
             index[i] = scn.nextInt();
             price[i] = scn.nextInt();
             sum += price[i]*index[i];
        }


        if (total == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        } 

    }
}
