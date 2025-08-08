package calculator;

public class CalculatorService {

    public double sum(Calculator calculator) {
        double result = 0;
        for (double n : calculator.getNumbers()) {
            result += n;
        }
        return result;
    }

    public double res(Calculator calculator) {
        double result = calculator.getNumbers().getFirst();
        for (int n=1 ; n < calculator.getNumbers().size() ; n++) {
            result -= calculator.getNumbers().get(n);
        }
        return result;
    }

    public double mul(Calculator calculator) {
        double result = calculator.getNumbers().getFirst();
        for (int n=1 ; n < calculator.getNumbers().size() ; n++) {
            result *= calculator.getNumbers().get(n);
        }
        return result;
    }

    public double div(Calculator calculator) {
        double result = calculator.getNumbers().getFirst();
        for (int n=1 ; n < calculator.getNumbers().size() ; n++) {
            if (calculator.getNumbers().get(n) == 0 || result == 0) {
                throw new IllegalArgumentException("Division by 0 not allowed at position: " + (n+1));
            }
            else {
                result /= calculator.getNumbers().get(n);
            }
        }
        return result;
    }

    public double pow(Calculator calculator) {
        if (calculator.getNumbers().size() != 2) {
            throw new IllegalArgumentException("Power operation needs base and exponent (2 numbers)");
        }
        else {
            return Math.pow(calculator.getNumbers().get(0), calculator.getNumbers().get(1));
        }
    }

    public double sqr(Calculator calculator) {
        if (calculator.getNumbers().size() != 1) {
            throw new IllegalArgumentException("Square root needs exactly 1 number");
        }
        else if (calculator.getNumbers().getFirst() < 0) {
            throw new IllegalArgumentException("Square root input can't be negative");
        }
        else {
            return Math.sqrt(calculator.getNumbers().getFirst());
        }
    }
}
