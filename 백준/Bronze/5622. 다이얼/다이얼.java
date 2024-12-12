import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 단어 입력
        String word = scanner.nextLine();
        int totalTime = 0;

        // 각 알파벳에 해당하는 다이얼 숫자 및 시간 계산
        for (char c : word.toCharArray()) {
            if (c >= 'A' && c <= 'C') {
                totalTime += 3; // 숫자 2
            } else if (c >= 'D' && c <= 'F') {
                totalTime += 4; // 숫자 3
            } else if (c >= 'G' && c <= 'I') {
                totalTime += 5; // 숫자 4
            } else if (c >= 'J' && c <= 'L') {
                totalTime += 6; // 숫자 5
            } else if (c >= 'M' && c <= 'O') {
                totalTime += 7; // 숫자 6
            } else if (c >= 'P' && c <= 'S') {
                totalTime += 8; // 숫자 7
            } else if (c >= 'T' && c <= 'V') {
                totalTime += 9; // 숫자 8
            } else if (c >= 'W' && c <= 'Z') {
                totalTime += 10; // 숫자 9
            }
        }

        // 결과 출력
        System.out.println(totalTime);

        scanner.close();
    }
}
