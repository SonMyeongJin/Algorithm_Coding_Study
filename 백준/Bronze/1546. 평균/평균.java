import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력: 과목 수 N
        int N = sc.nextInt();
        double[] scores = new double[N];

        // 점수 입력 받기
        double maxScore = 0; // 최댓값 저장
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextDouble();
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }

        // 점수 변환 및 평균 계산
        double sum = 0;
        for (int i = 0; i < N; i++) {
            scores[i] = (scores[i] / maxScore) * 100;
            sum += scores[i];
        }

        // 결과 출력: 평균 점수
        System.out.println(sum / N);
    }
}