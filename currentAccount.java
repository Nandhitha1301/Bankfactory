public abstract class currentAccount implements BankAccount {
    long deposit = 100000;
    int r = 7;
    int yr = 3;
    int interest = (int) ((deposit * r * yr) / 100);

    @Override
    public void createAccount() {
        System.out.println("Your deposit is: Rs." + deposit);

    }

    @Override
    public void InterestRate() {
        System.out.println("The interest rate is:" + r);
        System.out.println("No fo year:" + yr);
        System.out.println("The interest for current account is:" + interest);

    }
}
