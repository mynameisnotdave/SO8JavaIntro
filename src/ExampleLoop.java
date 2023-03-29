import java.util.Scanner;
public class ExampleLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Odd or even?");
        String wantOddOrEven = sc.nextLine();
        for (int i = 2; i<=20; i++) {
            switch (wantOddOrEven) {
                case "Even" -> {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
                case "Odd" -> {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
                default -> System.out.println("What did you say about me?"); // FIXME: Print this only once
            }
        }
    }
}