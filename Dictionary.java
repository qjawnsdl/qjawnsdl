import java.util.Scanner;

class Dictionary1 {
    private static String[] kor = {"사랑", "미래", "희망"};
    private static String[] eng = {"love", "future", "hope"};

    public static String kor2eng(String word) {
        for (int i = 0; i < kor.length; i++) {
            if (kor[i].equals(word)) {
                return eng[i];
            }
        }
        return "해당 단어를 찾을 수 없습니다.";
    }
}

public class Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("종료하시려면 exit를 입력해주세요.");
        while (true) {
            System.out.print("한국어 단어 >>");
            String word = scanner.nextLine();
            String translatedWord = Dictionary1.kor2eng(word);
            System.out.println(word + "의 영어 번역은 " + translatedWord);
            if (word.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

        scanner.close();
    }
}