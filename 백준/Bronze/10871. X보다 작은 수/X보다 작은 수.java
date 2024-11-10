import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();

        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            int value = scanner.nextInt();
            if (value < X) {
                result.add(value);
            }
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
        
    }
}
