import java.util.Random;
import java.util.Scanner;

public class java_study {
    public static void main(String[] args) {
        System.out.println("체력은 100입니다. 횟수는 무제한이고 체력이 0 이하로 까이면 집니다.");
        System.out.println("플레이어의 수를 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int playerCount = scanner.nextInt();
        int health = 100;
        boolean gameOn = true;
        while (gameOn) {
            for (int i = 0; i < playerCount; i++) {
                boolean continueAttacking = true;
                while (continueAttacking && health > 0) {
                    int damage = random.nextInt(1,15);
                    health -= damage;
                    System.out.println("플레이어 " + (i + 1) + "의 체력이 " + damage + "만큼 감소하여 " + health + "가 되었습니다.");

                    if (health <= 0) {
                        System.out.println("플레이어 " + (i + 1) + "가 체력이 0 이하로 떨어져 게임에서 졌습니다.");
                        gameOn = false;
                        break;
                    }

                    System.out.println("플레이어 " + (i + 1) + ", 계속 공격하시겠습니까? (y/n)");
                    String input = scanner.next();
                    if (!input.equalsIgnoreCase("y")) {
                        continueAttacking = false;
                    }
                }
                if (!gameOn) {
                    break;
                }
            }
        }

        scanner.close();
    }
}