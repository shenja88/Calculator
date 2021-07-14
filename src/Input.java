import java.util.Scanner;

public class Input {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static boolean checkInp() {
        if (SCANNER.hasNextInt()) {
            return true;
        } else {
            System.out.println("Enter a integer! Enter again.");
            SCANNER.next();
            return checkInp();
        }
    }

    public static int checkInt() {
        if (checkInp()) {
            int a = SCANNER.nextInt();
            while (true) {
                if (a >= 0) {
                    return a;
                } else {
                    System.out.println("Enter a integer >= 0");
                    break;
                }
            }
        }
        return checkInt();
    }

    public static int checkMenu() {
        if (checkInp()) {
            int a = SCANNER.nextInt();
            while (true) {
                if (a >= 0 && a < 6) {
                    return a;
                } else {
                    System.out.println("Enter select menu items 0-5");
                    break;
                }
            }
        }
        return checkInt();
    }
}

