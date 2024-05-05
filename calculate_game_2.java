//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

public class calculate_game_2 {
    public static int d = 0;
    public static int e = 0;



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
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
                    d ++ ;
                }
                else {
                    System.out.println("틀렸습니다.");
                    e ++ ;
                }
            }
            if (j1.equals("-")) {
                if (a - b == c) {
                    System.out.println("맞았습니다.");
                    d ++ ;
                }
                else {
                    System.out.println("틀렸습니다.");
                    e ++ ;
                }
            }
            if (j1.equals("*")) {
                if (a * b == c) {
                    System.out.println("맞았습니다.");
                    d ++ ;
                }
                else {
                    System.out.println("틀렸습니다.");
                    e ++ ;
                }
            }
            if (j1.equals("%")) {
                if (a / b == c) {
                    System.out.println("맞았습니다.");
                    d ++ ;
                }
                else {
                    System.out.println("틀렸습니다.");
                    e ++ ;
                }
            }
            }
        System.out.println("correct : " + d + "incorrect : " + e);
        System.out.println("종료합니다.");
        scanner.close();
    }
}