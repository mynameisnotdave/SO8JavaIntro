import java.util.Scanner;
public class ExampleNOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the weather today?" );
        String answer = sc.nextLine();

        if (!(answer.equals("Rain"))){
            System.out.println("We can take a walk to Snowdonia!");
        } else {
            System.out.println("Better to go back to sleep");
        }

        // extension : use Scanner to get the user answer
    }
}
