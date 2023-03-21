import java.util.Scanner;

class Demo{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int  number = scanner.nextInt();
        int fact = 1;
        //your code goes here
        while (number > 0) {
            fact *=number;
            number--;
        }
        System.out.println(fact);
    }
}