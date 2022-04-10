public class Program {
    public static void main(String[] args) {
        BankAccount Brandon=new BankAccount(5000.00,5000.00);
        Brandon.Deposit(100000.00, true);
        Brandon.Withdraw(2500.05, false);
        Brandon.TotalMoney();
    }
}
