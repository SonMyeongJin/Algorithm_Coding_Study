import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int value = scanner.nextInt();
                result.add(value);
            }

        int max = Collections.max(result);
        int min = Collections.min(result);

        System.out.println(min + " " + max);

    }
}
