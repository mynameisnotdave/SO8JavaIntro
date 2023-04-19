import java.util.Scanner;
public class FizzBuzz {
    public static int fizz = 3;
    public static int buzz = 5;


    public static void main(String[] args) {
        int fizzOrBuzz;
        Scanner sc = new Scanner(System.in);
        fizzOrBuzz = sc.nextInt();
        if (fizzOrBuzz % fizz == 0) {
            if (fizzOrBuzz % buzz != 0) {
                System.out.println("FIZZ!");
            }
        } else if (fizzOrBuzz % fizz != 0) {
            if (fizzOrBuzz % buzz != 0) {
                System.out.println("BUZZ!");
            }
        } else if (fizzOrBuzz % 5 == 0 && fizzOrBuzz % 3 == 0) {
            System.out.println("FIZZBUZZ!");
        }
        }
}