package calculator_hardware;
import java.util.List;

public class calculations {
    public static double addition(List<Double> numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum = sum + number;
        }
        return sum;
    }

    public static double substraction(List<Double> numbers) {
        if (numbers.isEmpty())
            return 0;
        double result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            result = result - numbers.get(i);
        }
        return result;
    }

    public static double multiplication(List<Double> numbers) {
        if (numbers.isEmpty()) return 0; 
        double count = 1;
        for (double number : numbers) {
            count = count * number;
        }
        return count;
    }

    public static double division(List<Double> numbers) {
        if (numbers.isEmpty())
            return 0;
        double result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) != 0) {
                result /= numbers.get(i);
            } else {
                System.out.println("Division by zero is not allowed.");
                return 0;
            }
        }
        return result;
    }
}
