package level1;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /, %): ");
            char operation = scanner.next().charAt(0);

            int result = 0;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                case '%':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("오류: 0으로 나눌 수 없습니다.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("오류: 올바른 연산 기호를 입력하세요 (+, -, *, /, %)");
                    continue;
            }

            System.out.println("결과: " + result);


            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String ext = scanner.next();

            if (ext.equalsIgnoreCase("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }
    }
}
