public class ThreeDigitCodes {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if(i == j) {
                    continue;
                }
                for (int k = 1; k <= 4; k++) {
                    if (k == i) {
                        continue;
                    }
                    if (k == j) {
                        continue;
                    }
                    String result = "" + i + j + k;
                    System.out.println(result);
                }
            }
        }
    }
}
