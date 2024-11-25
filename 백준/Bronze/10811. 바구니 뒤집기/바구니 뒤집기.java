import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받기
        int N = sc.nextInt(); // 바구니 개수
        int M = sc.nextInt(); // 역순 작업 횟수

        // 바구니 초기화
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1; // 바구니 번호는 1부터 시작
        }

        // M번 역순 작업 수행
        for (int m = 0; m < M; m++) {
            int i = sc.nextInt(); // 시작 인덱스
            int j = sc.nextInt(); // 끝 인덱스

            reverse(baskets, i - 1, j - 1); // 0-based 인덱스로 변환 후 역순 수행
        }

        // 결과 출력
        for (int num : baskets) {
            System.out.print(num + " ");
        }
    }

    // 배열의 특정 구간을 역순으로 바꾸는 메서드
    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            // 두 값을 교환
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
}