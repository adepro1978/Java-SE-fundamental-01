package java_se_17_fundamental;

public class CalcEngineArray {
    public static void main(String[] args) {

        int[] leftValue = {30, 20, 10, 40};
        int[] rightValue = {10, 15, 5, 20};
        char[] oprCode = {'+', '-', '*', '/'};
        int[] result = new int[oprCode.length];

        for (int i = 0; i < oprCode.length; i++) {
            switch (oprCode[i]) {

                // performs addition between numbers
                case '+':
                    result[i] = leftValue[i] + rightValue[i];
                    System.out.println(leftValue[i] + " + " + rightValue[i] + " = " + result[i]);
                    break;

                // performs subtraction between numbers
                case '-':
                    result[i] = leftValue[i] - rightValue[i];
                    System.out.println(leftValue[i] + " - " + rightValue[i] + " = " + result[i]);
                    break;

                // performs multiplication between numbers
                case '*':
                    result[i] = leftValue[i] * rightValue[i];
                    System.out.println(leftValue[i] + " * " + rightValue[i] + " = " + result[i]);
                    break;

                // performs division between numbers
                case '/':
                    result[i] = leftValue[i] / rightValue[i];
                    System.out.println(leftValue[i] + " / " + rightValue[i] + " = " + result[i]);
                    break;

                default:
                    System.out.print("Invalid operator!");
                    break;

            }
        }
    }
}