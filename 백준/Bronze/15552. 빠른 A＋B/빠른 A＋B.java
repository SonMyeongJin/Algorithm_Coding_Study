import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수 입력
        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" "); // 한 줄에 두 수 입력
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            bw.write((A + B) + "\n"); // 합계 결과 작성
        }

        bw.flush();
    }
}
