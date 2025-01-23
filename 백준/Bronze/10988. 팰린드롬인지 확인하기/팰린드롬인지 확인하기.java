import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 단어 입력받기
        String word = scanner.nextLine();
        
        // 입력된 단어가 팰린드롬인지 확인
        if (isPalindrome(word)) {
            System.out.println(1); // 팰린드롬이면 1 출력
        } else {
            System.out.println(0); // 팰린드롬이 아니면 0 출력
        }

        scanner.close();
    }

    // 팰린드롬 여부를 확인하는 메서드
    private static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}