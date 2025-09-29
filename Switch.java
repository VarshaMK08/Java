import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\nChoose operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        int choice = sc.nextInt();

        // --- 1. Normal switch (only one case executes) ---
        System.out.println("\n--- Normal Switch ---");
        switch (choice) {
            case 1:
                System.out.println("Addition: " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction: " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication: " + (a * b));
                break;
            case 4:
                if (b != 0)
                    System.out.println("Division: " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;
            default:
                System.out.println("Invalid choice");
        }

        // --- 2. Switch without break (fall-through: all remaining cases execute) ---
        System.out.println("\n--- Switch Fall-Through ---");
        switch (choice) {
            case 1:
                System.out.println("Addition: " + (a + b));
            case 2:
                System.out.println("Subtraction: " + (a - b));
            case 3:
                System.out.println("Multiplication: " + (a * b));
            case 4:
                if (b != 0)
                    System.out.println("Division: " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
            default:
                System.out.println("End of operations");
        }

        sc.close();
    }
}
