package calculator;

public class CalculatorService {

    public double sum(Calculator calculator) {
        double result = 0;
        for (double n : calculator.getNumbers()) {
            result += n;
        }
        return result;
    }
}
