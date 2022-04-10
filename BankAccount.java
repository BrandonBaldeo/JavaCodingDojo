public class BankAccount {
    private Double checkingBalance;
    private Double savingsBalance;
    private static Integer NumOfAccounts = 0;
    private static Double TotalMoney = 0D;

    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance=checkingBalance;
        this.savingsBalance=savingsBalance;
        TotalMoney+=checkingBalance+savingsBalance;
        NumOfAccounts++;
    }

    public Double GetCheckingBalance() {
        return checkingBalance;
    }

    public Double GetSavingsBalance() {
        return savingsBalance;
    }

    public void Deposit(Double Amount, Boolean isChecking) {
        if (isChecking) {
            this.checkingBalance += Amount;
            BankAccount.TotalMoney+=Amount;
            System.out.println("Current Checking Balance is:" + checkingBalance);
        } else {
            savingsBalance += Amount;
            BankAccount.TotalMoney+=Amount;
            System.out.println("Current Savings Balance is:" + savingsBalance);
        }
    }

    public void Withdraw(Double Amount, Boolean isChecking) {
        if (isChecking) {
            if (checkingBalance > Amount) {
                this.checkingBalance -= Amount;
                BankAccount.TotalMoney-=Amount;
                System.out.println("Current Checking Balance is:"+checkingBalance);
            }
        } else {
            if (savingsBalance > Amount) {
                this.savingsBalance -= Amount;
                BankAccount.TotalMoney-=Amount;
                System.out.println("Current Savings Balance is:" + savingsBalance);
            }
        }
    }
    
    public static Integer GetNumOfAccounts() {
        return NumOfAccounts;
    }

    public Double TotalMoney() {
        System.out.println("Total money is:" + checkingBalance + savingsBalance);
        return checkingBalance + savingsBalance;
        }
}
