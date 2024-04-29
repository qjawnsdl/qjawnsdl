import java.util.Scanner;

public class sigma {
    public static void main(String[] args) {
        System.out.println("시그마 계산기 두 정수를 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = calculateSigma(a, b);
        System.out.println(a + " sigma " + b + " = " + c);
    }
    public static int calculateSigma(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;

    }
}
