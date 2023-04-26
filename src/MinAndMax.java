// 1. import random class
import java.util.Arrays;
import java.util.Random;

public class MinAndMax {
    public static void main(String[] args) {
        // 2. create object random
        Random random = new Random();
        // 3. initialise empty array with size 10
        int[] randomNumbers = new int[10];
        // creating table with 10 columns, empty table
        // 4. generate random numbers to fill in your array
            for (int i = 0; i<randomNumbers.length; i++) {
                randomNumbers[i] = random.nextInt(101);
                System.out.println(randomNumbers[i]);
            }
        int max = randomNumbers[0]; // initially this is first index
        // 6. a. use for loops to compare max and array[i]
        // 6.b. inside the loop update max if array[i] is bigger
        for (int j = 1; j<randomNumbers.length; j++) { // why cant this be 0?
            if (max < randomNumbers[j]) { //go through all values. if max is less than the current value, max is the value?
                max = randomNumbers[j];

            }
        }
        System.out.println("\nLargest number is: " + max);
        // 7. to find the lowest, crate new variable min
        int min = randomNumbers[0];
        // 8. a. use for loop to compare min and array[i]
        // 8. b. inside the loop update min in array[i] is smaller
        for (int k=1; k<randomNumbers.length; k++){
            if (min > randomNumbers[k]) {
                // update max
                min = randomNumbers[k];
            }
        }
        System.out.println("\nSmallest number is: " + min);
        }
        // 5. to find the biggest element, create new variable max

        // 9. print max value

        // 10. print min value
    }


