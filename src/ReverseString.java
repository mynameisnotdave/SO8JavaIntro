import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("== REVERSE NAME GENERATOR ==");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        char[] letters = sc.nextLine().toCharArray();

        for (char letter : letters) {
            System.out.print(letter); // system.out.PRINT for single line output
        }
        System.out.println("\n"); // just for newline

        for (int i = letters.length; i > 0; i--) {
            System.out.print(letters[i - 1]); // slight hack with -1 to prevent out of bounds exception
        }

    }
}
