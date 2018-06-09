public class Account
{
    private String customername;
    private String account;
    private double balance;
    private String mobile;
    private String email;

    public void display() {
        System.out.println("Customer Name :" + customername);
        System.out.println("Account Number:" + account);
        System.out.println("Balance: " + balance);
        System.out.println("Mobile Number:" + mobile);
        System.out.println("Email:" + email);
    }

    public void deposit(double deposit) {
        this.balance += deposit;
        System.out.println("Depoit made of:" + deposit);
        System.out.println("New account balance is:" + this.balance);
    }

    public void withdrawl(double withdraw) {
     System.out.println("Withdrawl made of:" + withdraw);
        if (this.balance - withdraw <0)
            System.out.println("Your Account has insufficient funds");
        else {
            if (this.balance - withdraw >= 0)
                this.balance -= withdraw;
            System.out.println("Withdrawl amount is:" + withdraw);
            System.out.println("New account Balance is:" + this.balance);

        }
    }
    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String naccount) {
        this.account = naccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double nbalance) {
        this.balance = nbalance;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String nmobile) {
        this.mobile = nmobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
