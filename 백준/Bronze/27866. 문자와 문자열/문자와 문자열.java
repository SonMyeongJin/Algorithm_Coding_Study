import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열 S 입력
        String S = sc.nextLine();

        // 정수 i 입력
        int i = sc.nextInt();

        // i번째 문자 출력 (1-based 인덱스이므로 i-1을 사용)
        System.out.println(S.charAt(i - 1));
    }
}
