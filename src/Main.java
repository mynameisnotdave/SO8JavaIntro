import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("First number: ");
        int num1 = scanner.nextInt();
        System.out.println("Second number: ");
        int num2 = scanner.nextInt();
        subtract(num1,num2);
    }
    public static int subtract(int x, int y) {
        int result = x - y;
        System.out.println("Result: " + result);
        return result;
    }
}