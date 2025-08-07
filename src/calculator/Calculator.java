package calculator;
import java.util.List;

public class Calculator {
    private List<Double> numbers;

    public Calculator(List<Double> numbers) {
        this.numbers = numbers;
    }

    public List<Double> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Double> numbers) {
        this.numbers = numbers;
    }
}
