import java.io.*;

public class ThreeDigitCodes {
    public static String result;
    static File file = null;
    public static void main(String[] args) throws IOException {

        try {
            file = new File("result.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
                System.exit(0);
            }
        } catch (IOException f) {
            System.out.println("An error occurred.");
            f.printStackTrace();
        }
            try (PrintWriter output = new PrintWriter(file)) {
                for (int i = 1; i <= 4; i++) {

                    for (int j = 1; j <= 4; j++) {
                        if (i == j) {
                            continue;
                        }
                        for (int k = 1; k <= 4; k++) {
                            if (k == i) {
                                continue;
                            }
                            if (k == j) {
                                continue;
                            }
                            result = "" + i + j + k;
                            output.printf(result);
                            output.println();
                            System.out.println(result);

                        }
                    }
                }

            }
            IHaveACunningPlan();
        }
        /* This gets the count of unique files by creating a file and reading the lines.
        Would love to get the output stream and count from what was outputted,
        but can't find a solution for that / is it even possible.
        Ideally, this shouldn't be spread across two functions, but hey ho.
        Anyway this counts and deletes the file when done. Everything in main is related to the creation of the temporary file.
         */
        public static void IHaveACunningPlan() throws IOException {
            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader("result.txt"));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            int lines = 0;
            while (reader.readLine() != null) lines++;
            System.out.println("There are " + lines + " unique three digit numbers up to 500.");
            reader.close();
            if (file.delete()) {
                System.out.println("File deleted.");
            } else {
                System.out.println("File not deleted.");
            }
        }
    }