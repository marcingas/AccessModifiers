public class Main {
    public static void main(String[] args) {

Account martinsAccount = new Account("Marcin");
martinsAccount.deposit(1000);
martinsAccount.withdraw(500);
martinsAccount.withdraw(-200);
martinsAccount.deposit(-20);
martinsAccount.calculateBalance();
        System.out.println("Balance on account is " + martinsAccount.getBalance() );

    }
}