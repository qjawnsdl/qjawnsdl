import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class study_a {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("최소공배수 구하는 어플 ! 두 수를 입력해주세요.");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result_1 = lcm(num1, num2);
        System.out.println("최소공배수 : " + result_1);
        int result_2 = gcd(num1, num2);
        if (result_2 == 1) {
            System.out.println("최대공약수가 1입니다. 즉 서로소입니다.");
        }
        else {
            System.out.println("최대공약수 :" + result_2);
        }

    }
}