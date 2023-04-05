import java.util.Scanner;

public class TimesTableLoop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What times table would you like? : ");

        int timesTable = reader.nextInt();
        for(int i = 1; i<=12; i++) {
            System.out.println(timesTable * i);
        }
    }
}
