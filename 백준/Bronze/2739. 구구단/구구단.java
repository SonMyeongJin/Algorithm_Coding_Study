import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();

        for (int i = 1 ;i <= 9 ;i++ ){
            System.out.println(a + " * " + i + " = " + (a * i));
        }

    }
}
