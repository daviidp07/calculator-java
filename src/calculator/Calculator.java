package calculator;
import java.util.ArrayList;
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

    public void setNumbersFromString(String input) {
        String[] numbers = input.split(",");
        List<Double> numList = new ArrayList<>();
        for (String n : numbers ) {
            try {
                Double num = Double.parseDouble(n.trim());
                numList.add(num);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid number on: " + n);
            }
        }
        setNumbers(numList);
    }
}
