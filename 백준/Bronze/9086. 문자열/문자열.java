import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스 개수 입력
        int T = scanner.nextInt();
        scanner.nextLine(); // 줄바꿈 문자 소비

        for (int i = 0; i < T; i++) {
            // 문자열 입력
            String s = scanner.nextLine();
            // 첫 글자와 마지막 글자를 이어서 출력
            System.out.println("" + s.charAt(0) + s.charAt(s.length() - 1));
        }

        scanner.close();
    }
}
