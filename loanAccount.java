public abstract class loanAccount implements BankAccount {
    long deposit = 800000;
    int r=10;
    int yr=4;
    int interest = (int) ((deposit * r * yr)/100);

    @Override
    public void createAccount() {
        System.out.println("Your deposit is: Rs."+deposit);

    }

    @Override
    public void InterestRate() {
        System.out.println("The interest rate is:"+r);
        System.out.println("The years given is:"+yr);
        System.out.println("The interest for loan account is:"+interest);

    }
}