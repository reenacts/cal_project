package level2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /, %): ");
            String input = scanner.next();

            // 연산자 유효성 검증 => 형 변환x

            if (input.length() != 1) {
                System.out.println("연산기호를 1개만 입력하세요!");
                continue;
            }

            // 유효한 기호 형 변환
            char operation = input.charAt(0);

            double result = calculator.calculate(num1, num2, operation);

            if (!Double.isNaN(result)) {
                System.out.println("결과: " + result);
            }

            System.out.println("연산 기록: " + calculator.getHistory());

            while (true) {
                System.out.print("더 계산하시겠습니까? (exit 입력 시 종료, remove 입력 시 첫 번째 결과 제거): ");
                String ext = scanner.next();

                if (ext.equalsIgnoreCase("exit")) {
                    System.out.println("계산기를 종료합니다.");
                    System.exit(0);
                } else if (ext.equalsIgnoreCase("remove")) {
                    calculator.removeResult();
                    System.out.println("연산 기록: " + calculator.getHistory());
                } else {
                    break;
                }
            }
        }
    }
}