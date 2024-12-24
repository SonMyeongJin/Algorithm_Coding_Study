import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 체스의 올바른 피스 구성
        int[] correctPieces = {1, 1, 2, 2, 2, 8};

        // 발견한 흰색 피스 개수 입력
        int[] foundPieces = new int[6];
        for (int i = 0; i < 6; i++) {
            foundPieces[i] = scanner.nextInt();
        }

        // 결과 계산 및 출력
        for (int i = 0; i < 6; i++) {
            System.out.print((correctPieces[i] - foundPieces[i]) + " ");
        }

        scanner.close();
    }
}
