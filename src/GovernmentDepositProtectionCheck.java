public class GovernmentDepositProtectionCheck {
    public static void main(String[] args) {
        int maxProtectedDeposit = 85000;
        int balance = 43000;
        if (balance < maxProtectedDeposit) {
            System.out.println("Money is protected by deposit");
        }
        else {
            System.out.println("Money is not protected");
        }
    }
}
