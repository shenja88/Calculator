import java.util.Scanner;

public class Application {
    private final Scanner scanner = new Scanner(System.in);

    public void run(){
        System.out.println("The calculator program is initialized.");
        do {
            viewMenu();
            Operation operation = operation();
            if (operation == null) {
                break;
            }
            System.out.println("Input a integers to start operation:");
            int a = Input.checkInt();
            int b = Input.checkInt();
            System.out.println("Results: " + operation.calculate(a, b));
            System.out.println("Enter 'Yes' to continue calculation.");
        } while (scanner.nextLine().equals("Yes"));
        System.out.println("Goodbye.");
    }

    private void viewMenu(){
            System.out.println("""
                    Select the menu item:
                    1 - addition ( + ).
                    2 - subtraction ( - ).
                    3 - multiplication( * ).
                    4 - division( / ).
                    5 - modulo( % ).
                    0 - exit.""");
    }

    private Operation operation(){
        int x = Input.checkMenu();
        return switch (x) {
            case 1 -> new Addition();
            case 2 -> new Subtraction();
            case 3 -> new Multiplication();
            case 4 -> new Division();
            case 5 -> new Modulo();
            case 0 -> null;
            default -> operation();
        };
    }
}
