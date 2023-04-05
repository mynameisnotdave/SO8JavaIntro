public class Main {
    public static void main(String[] args) {
        int j = 0;
        int i;
        int k = 0;
        for (i = 1; i <= 4; i++) {

            for (j = 1; j <= 4; j++) {
                for (k = 1; k <= 4; k++) {
                    // Statements to eliminate duplicates
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
        System.out.println(i + j + k);
    }
}