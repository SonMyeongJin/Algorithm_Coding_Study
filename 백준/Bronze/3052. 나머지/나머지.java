import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        HashSet<Integer> remainders = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            remainders.add(numbers[i] % 42);
        }

        System.out.println(remainders.size());
    }
}