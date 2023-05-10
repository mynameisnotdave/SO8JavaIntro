import java.util.Scanner;

public class MyCalculator {
    static Scanner scanner = new Scanner(System.in);
    static int num1;
    static int num2;
    public static void main(String[] args) {
        System.out.println("Hello, what would you like to do today? Options (input as written, case sensitive): Add, Subtract, Multiply, Divide, All");
        String desiredAction = scanner.nextLine();
        switch (desiredAction) {
            case "Add":
                getNumbers();
                System.out.println(num1 + "+" + num2 + "=" + add(num1, num2));
                break;
            case "Subtract":
                getNumbers();
                System.out.println(num1 + "-" + num2 + "=" + subtract(num1, num2));
                break;
            case "Multiply":
                getNumbers();
                System.out.println(num1 + "*" + num2 + "=" + multiply(num1, num2));
                break;
            case "Divide":
                getNumbers();
                System.out.println(num1 + "/" + num2 + "=" + divide((double)num1, (double)num2));
                break;
            case "All":
                getNumbers();
                System.out.println(num1 + "+" + num2 + "=" + add(num1, num2));
                System.out.println(num1 + "-" + num2 + "=" + subtract(num1, num2));
                System.out.println(num1 + "*" + num2 + "=" + multiply(num1, num2));
                System.out.println(num1 + "/" + num2 + "=" + divide((double)num1, (double)num2));
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    public static void getNumbers() {
        System.out.println("First number: ");
        num1 = scanner.nextInt();
        System.out.println("Second number: ");
        num2 = scanner.nextInt();
    }

    public static int add(int x, int y) {
        return x+y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x*y;
    }
    public static double divide(double x, double y) {
        return x/y;
    }
}