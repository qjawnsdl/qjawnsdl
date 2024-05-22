import java.util.Scanner;

public class average_2 {
    public average_2 () {}
    public static int[] a = new int[10];
    int b = 0;
    int c = 0;
    public static String[] f = new String[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 과목이예요?");
        int e = scanner.nextInt();
        System.out.println("어떤 과목 평균을 구해드릴까요?");
        for (int i = 0; i<e; i++) {
            System.out.print(i+1 + ". "); f[i] = scanner.next();
        }
        int sum = 0;
        double result = 0;
        for (int i = 0; i<e; i++) {
            System.out.println(f[i] + ": ");
            a[i] = scanner.nextInt();
            sum += a[i];
            result = sum/e;
        }
        System.out.println("average =" + result);
    }
}

