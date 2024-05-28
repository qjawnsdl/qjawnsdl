import java.util.Scanner;

public class jinsu_2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 2진수 입력 받기
        System.out.print("2진수를 입력하세요: ");
        String binaryInput = scanner.nextLine();

        try {
            // 2진수 문자열을 10진수로 변환
            int decimalOutput = Integer.parseInt(binaryInput, 2);
            System.out.println("10진수로 변환된 값: " + decimalOutput);
        } catch (NumberFormatException e) {
            System.out.println("유효하지 않은 2진수입니다.");
        }

        scanner.close();
    }
}
