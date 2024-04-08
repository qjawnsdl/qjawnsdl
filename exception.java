import java.util.Scanner;
import java.util.InputMismatchException;


public class exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력하세요");
        int sum =0;
        int a=0;
        for (int i=0; i<3; i++) {
            System.out.println(">>");
            try {
                a = scanner.nextInt();
            }
            catch(InputMismatchException b) {
                System.out.println("정수가 아닙니다. 한 번 더 입력해주세요.");
                scanner.next();
                i--;
                continue;
            }
            sum += a;
        }
        System.out.println("합은"+sum+"입니다.");
        scanner.close();
    }
}
