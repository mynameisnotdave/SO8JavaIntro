public class Array {
    public static void main(String[] args) {
        // declare array of integer values with size 10
        int[] numbers = {13, 1, 3, 5, 4, 2, 90, 321, 123, 132};

        // display using for loop
        double sum = 0;
        for (int number : numbers) {
            System.out.println(number);
            sum += number;
        }
        double average = sum / numbers.length;
        System.out.println("\nSum of all numbers :" + sum);
        System.out.println("Average of all numbers: " + average);
    }
}
