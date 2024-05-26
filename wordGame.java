import java.util.ArrayList;
import java.util.Scanner;

public class wordGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<>();
        System.out.println("끝말잇기 게임을 시작합니다. '종료'를 입력하면 게임이 끝납니다.");

        while (true) {
            System.out.print("단어를 입력하세요: ");
            String word = scanner.nextLine();

            if (word.equals("종료")) {
                System.out.println("게임을 종료합니다.");
                break;
            }

            if (wordList.size() > 0) {
                String lastWord = wordList.get(wordList.size() - 1);
                char lastChar = lastWord.charAt(lastWord.length() - 1);
                char firstChar = word.charAt(0);

                if (lastChar != firstChar) {
                    System.out.println("잘못된 단어입니다. '" + lastChar + "'(으)로 시작하는 단어를 입력하세요.");
                    continue;
                }
            }

            if (wordList.contains(word)) {
                System.out.println("이미 사용된 단어입니다. 다른 단어를 입력하세요.");
                continue;
            }

            wordList.add(word);
            System.out.println("현재 단어 목록: " + wordList);
        }

        scanner.close();
    }
}