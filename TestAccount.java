public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account(1000);
        System.out.println(a1.deposite(200)); // to deposit
        try {
            System.out.println(a1.withdraw(1500)); // to withdraw
        } catch (balanceException e) {
         //  e.printStackTrace(); // devs: troubleshooting
         //  System.out.println(e); //logging : system audit
         System.out.println(e.getMessage()); //display on end user
        }
    }
}
