public class Account{   //called domain object
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }
    public double deposite(double amount){
        if(amount > 0){
        balance += amount;
        return balance;
        } else{
            throw new NumberFormatException("please provide non-negative no");
        }
    }
    public double withdraw(double amount)throws balanceException{
        if(amount<0)
            throw new NumberFormatException("please provide non-negative no");
        else if (amount<= balance) 
            balance-= amount;
        else
            throw new balanceException("insufficient fund");
        return balance;
    }
}