import java.util.Random;
import java.util.Scanner;

public class add_game {


    public static void main(String[] args) {
        boolean playagain = true;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
       while (playagain) {
           int a = random.nextInt(10, 100);
           int b = random.nextInt(10, 100);
           System.out.println(a + " " + "+" + " " + b + " " + "=");
           int c = scanner.nextInt();
           if (a + b == c) {
               System.out.println("맞았습니다.");
           } else {
               System.out.println("틀렸습니다.");
           }
           System.out.println("다시 하시겠어요? y/n");
           String answer = scanner.next();
           playagain = answer.equals("y");
       }
        System.out.println("종료합니다.");
       scanner.close();
    }
}
