public class SimpleCalculator {
    public static void main(String[] args) {

        double num1 = 10;
        double num2 = 5;
        char op = '+';   // Change operator here: +, -, *, /

        double result = 0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero!");
                    return;
                }
                break;

            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result = " + result);
    }
}