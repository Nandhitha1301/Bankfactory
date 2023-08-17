
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter your bank account type \'currentaccount\' \'savingsaccount\' \'loanaccount\'");
        Scanner sc=new Scanner(System.in);
        String ch=sc.next();
        ch.toLowerCase();
        switch(ch)
        {
            case "currentaccount":
                current c=new current();
                c.createAccount();
                c.InterestRate();
                c.curracc();
                break;
            case "savingsaccount":
                saving s = new saving();
                s.createAccount();
                s.InterestRate();
                s.savacc();
                break;
            case "loanaccount":
                loan l =new loan();
                l.createAccount();
                l.InterestRate();
                l.loanacc();
                break;
            default:
                System.out.println("Wrongly selected!! please enter correctly..");
                break;

        }

    }
}
