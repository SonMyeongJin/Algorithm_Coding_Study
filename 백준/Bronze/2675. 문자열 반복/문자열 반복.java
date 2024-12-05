import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스 개수 입력
        int T = scanner.nextInt();

        // 각 테스트 케이스 처리
        for (int t = 0; t < T; t++) {
            // 반복 횟수와 문자열 입력
            int R = scanner.nextInt();
            String S = scanner.next();

            // 결과 문자열 생성
            StringBuilder P = new StringBuilder();
            for (char c : S.toCharArray()) {
                // 각 문자를 R번 반복하여 추가
                for (int i = 0; i < R; i++) {
                    P.append(c);
                }
            }

            System.out.println(P.toString());
        }
    }
}
