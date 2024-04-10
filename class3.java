import java.util.InputMismatchException;
import java.util.Scanner;

public class class3 {
    public static void main(String[] args) {
        int[] intArray = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        Scanner scanner = new Scanner(System.in);
        boolean again = true;

        while (again) {

            try {

                System.out.println("돈을 입력하시오. >>");
                int a = scanner.nextInt();
                for (int i = 0; i < intArray.length; i++) {
                    int b = a / intArray[i];
                    a %= intArray[i];
                    System.out.println(intArray[i] + "짜리 : " + b + "개");
                }


                System.out.println("다시 하시겠습니까? (y/n)");
                String answer = scanner.next();
                again = answer.equals("y");
            } catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력해주세요.");
                scanner.next();
            }
        }

        System.out.println("종료합니다.");
        scanner.close();
    }
}