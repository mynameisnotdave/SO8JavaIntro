import java.util.*;

public class Duplicates {
    public static void main(String[] args) {
        List<Integer> duplicateValues = new ArrayList<>();
        Random random = new Random();
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(1, 21);
            arr2[i] = random.nextInt(1, 21);
        }
        for(int iterator1:arr1) {
            for(int iterator2:arr2) {
                if(iterator1 == iterator2) {
                    duplicateValues.add(iterator1);
                }
            }
        }System.out.println("Array 1 values: " + Arrays.toString(arr1));
        System.out.println("Array 2 values: " + Arrays.toString(arr2));
        System.out.println("Duplicate values: ");
        for(int generateValues : duplicateValues) {
            System.out.println(generateValues);
        }
    }
}