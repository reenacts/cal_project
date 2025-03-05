package level2;
import java.util.List;
import java.util.ArrayList;

public class Calculator {

    private List<Double> history;

    public Calculator() {
        this.history = new ArrayList<>();
    }

    public double calculate(int num1, int num2, char operation) {
        double result = 0;

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
                    result = (double)num1 / num2;
                } else {
                    System.out.println("오류: 0으로 나눌 수 없습니다.");
                    return Double.NaN;
                }
                break;
            default:
                System.out.println("오류: 올바른 연산 기호를 입력하세요 (+, -, *, /, %)");
                return Double.NaN;
        }

        history.add(result);
        return result;
    }

    // 캡슐화 적용
    public List<Double> getHistory(){
        return this.history;
    }
    public void removeResult() {
        if (!history.isEmpty()) {
            double removeValue = history.remove(0);
            System.out.println("제거한 연산 기록: " + removeValue);
        } else {
            System.out.println("연산 내용이 없습니다.");
        }
    }
}
