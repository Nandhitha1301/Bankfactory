public abstract class savingsAccount implements BankAccount
{
    long deposit = 500000;
    int r=6;
    int yr=5;
    int interest = (int) ((deposit * r * yr)/100);

    @Override
    public void createAccount() {
        System.out.println("Your deposit is: Rs."+deposit);

    }

    @Override
    public void InterestRate() {
        System.out.println("The interest rate is:"+r);
        System.out.println("No of years:"+yr);
        System.out.println("The interest for savings account is:"+interest);

    }
}
