import java.util.Scanner;
public class NameAndAgeGreeting {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Your username: ");
        String name = reader.nextLine();
        System.out.println("Your password: ");
        int password = reader.nextInt();
        System.out.println("Your user name is: " + name);
        System.out.println("Your password is: " + password);
    }
}
