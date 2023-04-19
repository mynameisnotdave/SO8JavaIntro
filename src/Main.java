public class Main {
    public static void main(String[] args) {RomanToInt("XIV");}

    public static void RomanToInt(String s) {
        // get string, find out what it contains, match keys to vals, turn string into int based on vals
        /*
                I             1
                V             5
                X             10
                L             50
                C             100
                D             500
                M             1000
         */
        for(int i=0; i<s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}