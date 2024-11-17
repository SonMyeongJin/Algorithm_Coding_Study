import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //학생 생성
        int[] students = new int[30];

        // 제출한 학생은 1을 부여 
        for (int i = 0; i < 28; i++) {
            int a = scanner.nextInt(); 
            students[a - 1] = 1;       
        }

        // ( 제출하지 않은 학생 = 0 ) 을 출력 
        for (int i = 0; i < 30; i++) {
            if (students[i] == 0) { 
                System.out.println(i + 1); 
            }
        }
    }
}