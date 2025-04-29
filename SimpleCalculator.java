public class SimpleCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java SimpleCalculator <num1> <operator> <num2>");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            char operator = args[1].charAt(0);
            double num2 = Double.parseDouble(args[2]);

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
    }
}
