public class CheckAge {
        // Create a checkAge() method with an integer variable called age
        static void	checkAge(int age) {

            // If age is less than 18, print "Access denied"
            if (age<18) {
                System.out.println("The age given is " + age + "."+ " Access denied");

                // If age is greater than, or equal to, 18, print "Access granted"
            } 	else {
                System.out.println("The age given is " + age + "." + " Access granted");
            }

        }

        public static void main(String[] args) {
            // Call the checkAge method and pass along an age of 20
            checkAge(10);
            checkAge(30);
            checkAge(6);
        }
    }