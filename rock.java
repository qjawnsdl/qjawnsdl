import java.util.Random;
import java.util.Scanner;

public class rock {
    public static void main(String[] args) {
        System.out.println("가위바위보 게임입니다. 가위 바위, 보 중에서 입력하세요");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("철수 >>");
        String choice1 = scanner.next();
        String[] choices = {"가위", "바위", "보"};
        int randomindex = random.nextInt(3);
        String choice2 = choices[randomindex];
    }
}
