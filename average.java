import java.util.Scanner;

public class average {
    public average () {}
    int a = 0;
    int b = 0;
    int c = 0;
    public double getArea() {
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("영어,중국어,일본어 순으로 입력.");
        average d = new average();
        d.a = scanner.nextInt();
        d.b = scanner.nextInt();
        d.c = scanner.nextInt();
        System.out.println("average =" + d.getArea());
    }
}
