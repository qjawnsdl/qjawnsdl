import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class cal {
    private static Map<LocalDate, String> scheduleMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 캘린더 보기");
            System.out.println("2. 일정 추가");
            System.out.println("3. 일정 보기");
            System.out.println("4. 종료");
            System.out.print("선택하세요: ");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    viewCalendar(scanner);
                    break;
                case 2:
                    addSchedule(scanner);
                    break;
                case 3:
                    viewSchedule(scanner);
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
            }
        }
    }

    private static void viewCalendar(Scanner scanner) {
        System.out.print("연도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요 (1-12): ");
        int month = scanner.nextInt();

        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate firstDayOfMonth = yearMonth.atDay(1);
        LocalDate lastDayOfMonth = yearMonth.atEndOfMonth();

        System.out.println("\n" + yearMonth.getMonth().getDisplayName(TextStyle.FULL, Locale.KOREAN) + " " + year);
        System.out.println("일 월 화 수 목 금 토");

        DayOfWeek firstDayOfWeek = firstDayOfMonth.getDayOfWeek();
        int value = firstDayOfWeek.getValue();
        for (int i = 1; i < value; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= lastDayOfMonth.getDayOfMonth(); day++) {
            LocalDate date = LocalDate.of(year, month, day);
            if (scheduleMap.containsKey(date)) {
                System.out.printf("%2d*", day);
            } else {
                System.out.printf("%2d ", day);
            }

            if ((day + value - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void addSchedule(Scanner scanner) {
        System.out.print("연도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요 (1-12): ");
        int month = scanner.nextInt();
        System.out.print("일을 입력하세요: ");
        int day = scanner.nextInt();
        scanner.nextLine();  // 버퍼 비우기

        LocalDate date = LocalDate.of(year, month, day);
        System.out.print("일정을 입력하세요: ");
        String schedule = scanner.nextLine();

        scheduleMap.put(date, schedule);
        System.out.println("일정이 추가되었습니다.");
    }

    private static void viewSchedule(Scanner scanner) {
        System.out.print("연도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요 (1-12): ");
        int month = scanner.nextInt();
        System.out.print("일을 입력하세요: ");
        int day = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, day);

        if (scheduleMap.containsKey(date)) {
            System.out.println("일정: " + scheduleMap.get(date));
        } else {
            System.out.println("해당 날짜에 일정이 없습니다.");
        }
    }
}