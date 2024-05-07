import java.util.Scanner;

abstract class Calc {
    protected int a;
    protected int b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract int calculate();
}

class study extends Calc {
    private char operator;

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        a = scanner.nextInt();

        System.out.print("정수를 입력하세요: ");
        b = scanner.nextInt();

        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        operator = scanner.next().charAt(0);
    }

    public int add() {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }

    public int multiply() {
        return a * b;
    }

    public int divide() {
        if (b == 0) {
            System.out.println("무한대로 발산합니다.");
        }
        return a / b;
    }

    @Override
    public int calculate() {
        switch (operator) {
            case '+':
                return add();
            case '-':
                return subtract();
            case '*':
                return multiply();
            case '/':
                return divide();
            default:
                System.out.println("잘못된 연산자입니다.");
                return 0;
        }
    }

    public static void main(String[] args) {
        study calculator = new study();

        calculator.input();

        int calculateResult = calculator.calculate();
        System.out.println("사칙연산 결과: " + calculateResult);
    }
}