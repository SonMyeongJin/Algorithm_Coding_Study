import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 숫자 입력
        String A = scanner.next();
        String B = scanner.next();

        // 숫자를 거꾸로 읽기
        int reversedA = reverseNumber(A);
        int reversedB = reverseNumber(B);

        // 더 큰 수 출력
        System.out.println(Math.max(reversedA, reversedB));

        scanner.close();
    }

    // 숫자를 거꾸로 읽는 메서드
    private static int reverseNumber(String number) {
        StringBuilder reversed = new StringBuilder(number).reverse();
        return Integer.parseInt(reversed.toString());
    }
}