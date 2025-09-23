package Assignments.Assignment9.Lession12.problem2;

public class TestCustomerAccount {
    public static void main(String[] args) {
        CustomerAccount account = new CustomerAccount("Michael","378536",200);

        System.out.println("\nDepositing amount");
        try{
            account.deposit(-20);

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\nDepositing amount");
        try{
            account.deposit(60);

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        

        System.out.println("\nWithdrawing more than the balance");
        try{
            account.withdraw(280);
        }catch(AccountException eac){
            System.out.println(eac.getMessage());
        }

        System.out.println("\nWithdrawing valid amount that drops below $100");
        try{
            account.withdraw(190);
        }catch(AccountException eac){
            System.out.println(eac.getMessage());
        }


        System.out.println("\nWithdrawing valid amount");
        try{
            account.withdraw(45.55);
        }catch(AccountException eac){
            System.out.println(eac.getMessage());
        }

        System.out.printf("\nTotal Balance : $%.2f",account.getBalance());
    }

}
/*

Depositing amount
Deposit can not be negative

Depositing amount
Successful deposit : $60.0

Withdrawing more than the balance
Insufficient funds! Withdrawal amount exceeds balance.

Withdrawing valid amount that drops below $100
Low balance warning! Balance cannot go below $100.

Withdrawing valid amount
Withdrawal Successful : $45.55

Total Balance : $214.45

 */