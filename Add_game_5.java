import java.util.Random;
import java.util.Scanner;

public class Add_game_5 {
    public static int[] a = new int[10];
    public static int[] b = new int[10];
    public static int[] c = new int[10];
    public static int[] d = new int[10];
    public static int e = 0;
    public static int f = 0;


    public static void main(String[] args) {
        boolean playagain = true;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (playagain) {
            for (int i = 0; i < 10; i++) {
                a[i] = random.nextInt(100);
                b[i] = random.nextInt(0, a[i]);


                a[i] = random.nextInt(100);
                b[i] = random.nextInt(0, a[i]);
                String[] operations = {"+", "-", "*", "%"};
                int randomindex = random.nextInt(4);
                String operation = operations[randomindex];

                System.out.println(a + " " + operation + " " + b + " " + "=");
                c[i] = scanner.nextInt();
                if (operation.equals("+")) {
                    d[i] = a[i] + b[i];
                } else if (operation.equals("-")) {
                    d[i] = a[i] - b[i];
                } else if (operation.equals("*")) {
                    d[i] = a[i] * b[i];
                } else if (operation.equals("%")) {
                    if (b[i] != 0) {
                        d[i] = a[i] % b[i];
                    } else {
                        d[i] = 0; // 나누는 수가 0인 경우 처리
                    }
                }

                if (c[i] == d[i]) {
                    System.out.println("맞았습니다.");
                    e++;
                } else {
                    System.out.println("틀렸습니다.");
                    f++;
                }
            }


        }
        System.out.println("성적출력 : 맞은 문제 :" + e + "틀린 문제 :" + f);
        if (f == 0) {
            System.out.println("다 맞추셨네요 틀린문제가 없습니다.");
        } else {
            System.out.println("틀린 문제입니다.");
            for (int i = 0; i < f; i++) {
                if (c[i] != d[i]) {
                    System.out.println(a[i] + "+" + b[i] + "=");
                    c[i] = scanner.nextInt();
                    d[i] = a[i] + b[i];
                    if (c[i] == d[i]) {
                        System.out.println("맞았습니다.");

                    } else {
                        System.out.println("틀렸습니다. 정답은" + d[i] + "입니다.");
                    }

                }
            }

            System.out.println("다시 하시겠어요? y/n");
            String answer = scanner.next();
            playagain = answer.equals("y");
        }
    }


}


