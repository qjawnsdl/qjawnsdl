import java.util.Random;
import java.util.Scanner;

public class calculate_game {


    public static void main(String[] args) {
        boolean playagain = true;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (playagain) {
            int a = random.nextInt(100);
            int b = random.nextInt(0 , a);
            String[] j = {"+","-","*","%"};
            int randomindex = random.nextInt(4);
            String j1 = j[randomindex];

            System.out.println(a + " " + j1 + " " + b + " " + "=");
            int c = scanner.nextInt();
            if (j1.equals("+")) {
                if(a + b == c) {
                    System.out.println("맞았습니다.");
                }
                else {
                    System.out.println("틀렸습니다.");
                }
            }
            if (j1.equals("-")) {
                if (a - b == c) {
                    System.out.println("맞았습니다.");
                }
                else {
                    System.out.println("틀렸습니다.");
                }
            }
            if (j1.equals("*")) {
                if (a * b == c) {
                    System.out.println("맞았습니다.");
                }
                else {
                    System.out.println("틀렸습니다.");
                }
            }
            if (j1.equals("%")) {
                if (a / b == c) {
                    System.out.println("맞았습니다.");
                }
                else {
                    System.out.println("틀렸습니다.");
                }
            }
            System.out.println("다시 하시겠어요? y/n");
            String answer = scanner.next();
            playagain = answer.equals("y");
        }
        System.out.println("종료합니다.");
        scanner.close();
    }
}
