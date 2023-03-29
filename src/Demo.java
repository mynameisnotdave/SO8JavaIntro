import java.util.Scanner;

class Demo{
    public static void main(String[] args) {

        double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
        //your code goes here
        double average = 0;
        for (double x: revenue) {
            average += x;
        }
        System.out.println(average / revenue.length);
    }
}