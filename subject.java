import java.util.Scanner;

public class subject {
    public static void main(String[] args) {
        String[] courses = {"java", "python", "HTML5", "컴퓨터구조", "안드로이드"};
        int[] scores = {100, 88, 87, 85, 82};

        Scanner scanner = new Scanner(System.in);
        boolean a = false;
        System.out.println("종료하시려면 exit를 입력해주세요.");

        while (!a) {
            System.out.print("과목명을 입력하세요: ");
            String input = scanner.next();

            if (input.equals("exit")) {
                a = true;
            } else {
                boolean b = false;
                for (int i = 0; i < courses.length; i++) {
                    if (courses[i].equals(input)) {
                        System.out.println(input + "의 점수는 " + scores[i] + "입니다.");
                        b = true;
                        break;
                    }
                }

                if (!b) {
                    System.out.println("과목이 없습니다.");
                }
            }
        }

        scanner.close();
    }
}