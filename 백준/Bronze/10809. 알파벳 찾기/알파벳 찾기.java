import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 단어 입력
        String S = scanner.nextLine();

        // 알파벳 위치 배열 (-1로 초기화)
        int[] alphabetPositions = new int[26];
        for (int i = 0; i < 26; i++) {
            alphabetPositions[i] = -1;
        }

        // 단어의 각 문자에 대해 첫 등장 위치 기록
        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            int index = currentChar - 'a';
            if (alphabetPositions[index] == -1) {
                alphabetPositions[index] = i;
            }
        }

        // 결과 출력
        for (int i = 0; i < 26; i++) {
            System.out.print(alphabetPositions[i] + " ");
        }

    }
}