import java.math.BigInteger;

public class FibonnaciCalc {
    // main method
    public static void main (String[] args){
        fibonacci(100);
    }

    // own method
    public static void fibonacci(int counter) {
        // declare variable num1=0 and num2 = 1
        BigInteger num1= BigInteger.valueOf(0);
        BigInteger num2= BigInteger.valueOf(1);
        //BigInteger num1= new BigInteger("0");
        //BigInteger num2 = new BigInteger("1");
        // print num1 and num2 each in a new line

        // declare variable nextNum

        // 0-1-1-2 - we have to use loop
        for (int i=1; i<counter; i++){
            BigInteger nextNum = num1.add(num2);
            // calculate nextNum = num1 + num2
            // print the nextNum
            System.out.println(nextNum);
            // moving to the next sequence by updating num1 and num2

            // num1 is now num2
            num1 = num2;
            // num2 is now nextNum
            num2 = nextNum;
            // end of loop
        }
    }
}
