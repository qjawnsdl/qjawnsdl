import java.util.Scanner;
import java.util.Random;
public class 1 {
    public static void main(String[] args) {
        System.out.println("수를 결정하였습니다. 맞추어 보세요");
        System.out.println(("0~99사이 숫자 맞추기 놀이"));
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {



            int r = random.nextInt(100);
            int a = scanner.nextInt();


            if (r < a) {
                System.out.println("더 낮게");
            }
            else if (r > a) {
                System.out.println("더 높게");
            }
            else {
                System.out.println("맞았습니다. 한 번 더? y/n");
                String text = scanner.next();
                if (text.equals("n")) {
                    break;
                }
            }
        }
        System.out.println("종료합니다");
        scanner.close();
    }
}
