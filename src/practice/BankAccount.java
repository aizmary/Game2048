package practice;

public class BankAccount {
    private double amount;



    public double getAmount(){

        return amount;
    }


    public void deposit(double sum) {
        amount = amount + sum;

    }


    public double withdraw(int sum)  throws LimitException{

        if (sum > amount) {
            System.out.println("Запрашиваемая сумма больше остатка");
            throw new LimitException("Запрашиваемая сумма больше остатка. Осталось: " +  amount, amount);
        }
        else {

            amount = amount - sum;
        }
        return amount;
    }
}
