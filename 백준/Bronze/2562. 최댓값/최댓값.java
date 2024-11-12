import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[9];  // 9개의 자연수를 저장할 배열
        for (int i = 0; i < 9; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maxValue = numbers[0];
        int maxIndex = 1;

        for (int i = 1; i < 9; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i + 1;
            }
        }

        System.out.println(maxValue);
        System.out.println(maxIndex);

        scanner.close();
    }
}
