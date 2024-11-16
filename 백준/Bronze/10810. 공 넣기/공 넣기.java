import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bucket = scanner.nextInt();
        int behaviour = scanner.nextInt();

        // 바구니를 만들고
        int[] buckets = new int[bucket];

        // behaviour만큼 행동을 할꺼야
        for (int a = 0; a < behaviour; a++) {
            // i부터 j까지 바구니에 k번 공을 넣는거임
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();

            for (int b = i -1 ; b < j ; b++) {
                buckets[b] = k;
            }
        }

        // 결과 출력
        for (int value : buckets) {
            System.out.print(value + " ");
        }
    }
}