import java.util.Scanner;
import java.util.Random;

public class rock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("플레이어의 이름을 입력하세요: ");
        String playerName = scanner.nextLine();

        boolean playAgain = true;

        while (playAgain) {
            System.out.print(playerName + " >> 가위, 바위, 보 중 하나를 입력하세요: ");
            String choice1 = scanner.nextLine();


            String[] choices = {"가위", "바위", "보"};
            int randomIndex = random.nextInt(3);
            String choice2 = choices[randomIndex];


            String winner = "";
            if (choice1.equals(choice2)) {
                System.out.println("무승부입니다! 다시 가위바위보를 진행합니다.");
                continue;
            } else if ((choice1.equals("가위") && choice2.equals("보")) ||
                    (choice1.equals("바위") && choice2.equals("가위")) ||
                    (choice1.equals("보") && choice2.equals("바위"))) {
                winner = playerName;
            } else {
                winner = "컴퓨터";
            }


            System.out.println(playerName + "의 선택: " + choice1);
            System.out.println("컴퓨터의 선택: " + choice2);
            System.out.println("승자: " + winner);

            System.out.print("다시 시작하시겠습니까? (y/n): ");
            String answer = scanner.nextLine();
            playAgain = answer.equalsIgnoreCase("y");
        }

        System.out.println("게임을 종료합니다.");
        scanner.close();
    }
}