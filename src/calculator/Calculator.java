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
        String[] numbers = input.split("[, ]");
        List<Double> numListTemp = new ArrayList<>();
        for (String n : numbers) {
            try {
                double num = Double.parseDouble(n.trim());
                numListTemp.add(num);
            }
            catch (NumberFormatException e) {
                throw new IllegalArgumentException ("Invalid number: "+n);
            }
        }
        if (numListTemp.size() == 0) {
            throw new IllegalArgumentException ("not found valid numbers");
        }
        else {
            return new Calculator(numListTemp);
        }
    }
}
