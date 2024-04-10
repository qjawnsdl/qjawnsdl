import java.util.InputMismatchException;
import java.util.Scanner;

public class divisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again = true;

        while(again) {
            int a = 0;
            int b = 0;
            try {
                System.out.println("나누어질 정수를 입력하세요.");
                a = scanner.nextInt();
                System.out.println("나눌 정수를 입력하세요");
                b = scanner.nextInt();
                System.out.println(a+"를 "+b+"로 나누면 몫은"+a/b+"입니다.");
                System.out.println("더 하실겁니까? y/n");
                String answer = scanner.next();
                again = answer.equals("y");

            }
            catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다. 한 번 더 입력해주세요.");
                scanner.nextLine();

            }
        }
        System.out.println("종료합니다.");

    }
}
