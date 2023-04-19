import java.util.Scanner;
public class ExistArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check if number exists: ");
        int existArray = sc.nextInt();
        boolean numberExists = false;
        int[] numbers = {1,2,3,4,5};


        for (int number : numbers) {
            if (existArray == number) {
                numberExists = true;
                break;
            }
        }
        if(numberExists) {
            System.out.println("Value of " + existArray + " was found");
        }
        else {
            System.out.println("Number not found");
        }
    }
}