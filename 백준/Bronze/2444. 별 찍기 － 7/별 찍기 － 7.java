import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받기
        int N = scanner.nextInt();

        // 윗부분 (증가하는 별)
        for (int i = 1; i <= N; i++) {
            // 공백 출력
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아랫부분 (감소하는 별)
        for (int i = N - 1; i >= 1; i--) {
            // 공백 출력
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
