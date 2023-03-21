import java.util.Scanner;
public class SquareCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter width *DECIMAL NUMBER ONLY*:");
        double width = reader.nextDouble();
        System.out.println("Enter height *DECIMAL NUMBER ONLY*:");
        double height = reader.nextDouble();
        System.out.println("Width is: " + width);
        System.out.println("Height is: " + height);
        double perimeter;
        perimeter = width * 2 + height * 2;
        double area = width * height;
        System.out.println("\nSquare perimeter is " + perimeter);
        System.out.println("Area of square is " + area);
    }
}
