import java.util.Scanner;

public class MinMaxMethods {

static int val1;
static int val2;
static int val3;

    public static void main(String[] args) {
        getValues();
        System.out.println("Minimum value is: " + returnMinimum());
        System.out.println("Maximum value is: " + returnMaximum());
    }
    public static void getValues() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three values: ");
        val1 = sc.nextInt();
        System.out.println("And the next: ");
        val2 = sc.nextInt();
        System.out.println("And the last one: ");
        val3 = sc.nextInt();
    }
    public static int returnMinimum() {
        int[] valuesforMin = {val1, val2, val3};
        int minimum = valuesforMin[0];
        for(int i = 1; i < valuesforMin.length; i++) {
            if(minimum > valuesforMin[i]) {
                minimum = valuesforMin[i];
            }
        }
        return minimum;
    }

    public static int returnMaximum() {
        int[] valuesforMax = {val1, val2, val3};
        int maximum = valuesforMax[0];
        for(int j = 1; j < valuesforMax.length; j++) {
            if(maximum < valuesforMax[j]) {
                maximum = valuesforMax[j];
            }
        }
        return maximum;
    }
}
