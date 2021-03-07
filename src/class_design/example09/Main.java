package class_design.example09;

public class Main {
    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount((int)(Math.random()*1000));
        // acct.setAmount((-acct.getAmount()));
        // acct.amount = 0;
        // acct.setAmount(0);
        acct.changeAmount(-acct.getAmount());
        System.out.println(acct.getAmount());
    }
}
