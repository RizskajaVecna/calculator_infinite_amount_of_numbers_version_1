package calculator_hardware;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("What operation do you what?\naddition\nsubstraction\nmultiplication\ndivision");
        Scanner scan = new Scanner(System.in);
        String t_operation = scan.nextLine();
        List<Double> numbers = new ArrayList<>();
        int n = 0;
        while (true) {
            n++;
            System.out.printf("Enter the %d number:\n", n);
            String input = scan.nextLine();

            if (input.isEmpty()) {
                break;
            }
            try {
                double number = Double.parseDouble(input); // parsing into double type
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input");
                continue;
            }
        }
        scan.close();

        switch (t_operation) {
            case "addition":
                System.out.println(calculations.addition(numbers));
                break;
            case "substraction":
                System.out.println(calculations.substraction(numbers));
                break;
            case "multiplication":
                System.out.println(calculations.multiplication(numbers));
                break;
            case "division":
                System.out.println(calculations.division(numbers));
                break;
        }
    }
}


