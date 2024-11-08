import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수의 개수 N 입력
        int N = scanner.nextInt();

        // N개의 정수를 입력받아 배열에 저장
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 찾으려는 정수 v 입력
        int v = scanner.nextInt();

        // numbers 배열에서 v의 개수를 센다
        int count = 0;
        for (int num : numbers) {
            if (num == v) {
                count++;
            }
        }

        // 결과 출력
        System.out.println(count);
        
    }
}
