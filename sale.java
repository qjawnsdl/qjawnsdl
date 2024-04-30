import java.util.Scanner;

public class sale {
    public static void main(String[] args) {
        System.out.println("가격과 할인률을 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("가격(원) :");
        int a = scanner.nextInt();
        System.out.print("할인율(%) :");
        int b = scanner.nextInt();
        int c = a - (a / 100 * b);
        System.out.println(c);
    }
}
