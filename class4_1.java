import java.util.Scanner;

public class class4_1 {
    private String brand;
    private int year;
    private int size;
    void show() {
        System.out.println(brand + "(이)가 제작한" +" " + year + "년형"  +" "  + size + "인치 제품입니다.");
    }
    public class4_1 (String brand, int year, int size) {
            this.brand = brand;
            this.year = year;
            this.size = size;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("브랜드를 입력해주세요");
        String brand = scanner.nextLine();
        System.out.println("연도를 입력해주세요");
        int year = scanner.nextInt();
        System.out.println("크기를 입력해주세요");
        int size = scanner.nextInt();
        class4_1 a = new class4_1(brand, year, size);
        a.show();
    }
}
