import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double num1;
        double num2;
        double ans;
        char op;

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);

        switch (op) {
            case '+' -> ans = calculator.add(num1, num2);
            case '-' -> ans = calculator.subtract(num1, num2);
            case '*' -> ans = calculator.multiply(num1, num2);
            case '/' -> ans = calculator.divide(num1, num2);
            default -> {
                System.out.print("Error! Enter a valid operator");
                return;
            }
        }

        System.out.print("\nThe result is given as follows:\n");
        System.out.print(num1 + " " + op + " " + num2 + " = " + ans);
    }
}
