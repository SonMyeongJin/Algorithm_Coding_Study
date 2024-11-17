import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bucket = scanner.nextInt();
        int behaviour = scanner.nextInt();

        // 바구니를 만들고
        int[] buckets = new int[bucket];

        // 바구니에 초기 공을 넣고
        for (int i = 0; i < bucket; i++) {
            buckets[i] = i+1;
        }

        // behaviour만큼 행동을 할꺼야
        for (int a = 0; a < behaviour; a++) {
            // i번이랑 j번 바구니의 공을 서로 바꿈
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            int temp = buckets[i - 1];
            buckets[i - 1] = buckets[j - 1];
            buckets[j - 1] = temp;
        }

        // 결과 출력: 각 바구니에 들어있는 공의 번호
        for (int b = 0; b < bucket; b++) {
            System.out.print(buckets[b] + " ");
        }

    }
}