import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받은 문자열
        String input = scanner.nextLine().trim();

        // 단어 개수 계산
        if (input.isEmpty()) {
            System.out.println(0); 
            // 입력이 공백만 있는 경우 단어 개수는 0
        } else {
            String[] words = input.split("\\s+"); 
            // 공백을 기준으로 단어 분리
            System.out.println(words.length);
        }

        scanner.close();
    }
}
