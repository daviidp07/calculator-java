package calculator;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> numList;

    public Calculator(List<Double> numbers) {
        this.numList = numbers;
    }

    public Calculator() {
        this.numList = new java.util.ArrayList<>();
    }

    public List<Double> getNumbers() {
        return numList;
    }

    public void setNumbers(List<Double> numbers) {
        this.numList = numbers;
    }

    public static Calculator fromString(String input) {
        Calculator cal = new Calculator();
        String[] numbers = input.split(",");
        for (String n : numbers) {
            try {
                double num = Double.parseDouble(n);
                numList.add(num);
            }
            catch (NumberFormatException e) {
                throw new IllegalArgumentException ("Invalid number");
            }
        }
        if (numList.size() == 0) {
            throw new IllegalArgumentException ("Invalid number");
        }
        return cal;
    }
}
