public class ThreeDigitCodes {
    static int uCount = 0;
    public static String result;
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        for (i = 1; i <= 4; i++) {

                for (j = 1; j <= 4; j++) {
                    if (i == j) {
                        continue;
                    }
                    for (k = 1; k <= 4; k++) {
                        if (k == i) {
                            continue;
                        }
                        if (k == j) {
                            continue;
                        }
                        result = "" + i + j + k;
                        System.out.println(result);
                        uCount++;

                    }
                }
            }
            System.out.println("There are " + uCount + " unique numbers up to 500.");
            }
}

