import java.util.Random;
import java.util.Arrays;
public class RandomNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(10);
        int[] randomArray = random.ints(12).toArray();

    }
}
