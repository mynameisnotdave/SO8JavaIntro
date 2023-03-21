import java.util.Scanner;
public class ExampleOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String whatAnimalIsThis = "dog";
        String whatAnimalIsThis2 = "monkey";
        if (whatAnimalIsThis.equals("dog")  || whatAnimalIsThis2.equals("monkey")) {
            System.out.println("That's an amazing dog..or monkey!");
        } else {
            System.out.println("I don't recommend this animal as a pet");
        }
    }
}
