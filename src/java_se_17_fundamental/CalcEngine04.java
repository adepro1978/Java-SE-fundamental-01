package java_se_17_fundamental;

//Using Switch Case

import java.util.Scanner;

public class CalcEngine04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();


        System.out.print("Enter the type of operation you want to perform (+, -, *, /, %): ");
        String operation = input.next();
        int result = performOperation(firstNumber, secondNumber, operation);
        System.out.println("Your answer is: " + result);
    }

    // Method to perform calculation.
    public static int performOperation(int firstNumber, int secondNumber, String operation) {
        int result = 0;
        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "%":
                result = firstNumber % secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        return result;
    }
}