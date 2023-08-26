package java_se_17_fundamental;

import java.util.Scanner;

public class CalcEngineIfElse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  input data from the user using the Scanner class
        System.out.print("Enter the first number : ");
        int a = input.nextInt();
        System.out.print("Enter the Second number : ");
        int b = input.nextInt();

        // selecting the operator for calculations
        System.out.print(
                "Choose and Enter the type of operation you want to perform (+, -, *, /, %) : ");
        char op = input.next().charAt(0);
        int answer = execute(a, b, op);
        System.out.println(answer);
    }

    public static int execute(int a, int b, char op) {
        int result = 0;
        // addition
        if (op == '+') {
            result = a + b;
            // subtraction
        } else if (op == '-') {
            result = a - b;
            // multiplication
        } else if (op == '*') {
            result = a * b;
            // modulo
        } else if (op == '%') {
            result = a % b;
            // division
        } else if (op == '/') {
            result = a / b;
        }
        return result;
    }
}