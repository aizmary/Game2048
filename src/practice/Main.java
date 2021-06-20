package practice;

public class Main {

    public static void main(String[] args) {


        BankAccount user = new BankAccount();
        user.deposit(20000);

        System.out.println("У вас на счету: " + user.getAmount() + " сом");


        while (true) {

            try {
                System.out.println(user.withdraw(6000));

            } catch (LimitException e) {

                System.out.println("У вас на счету: " + e.getRemainingAmount() +
                        " сом. Был снят остаток: " + e.getRemainingAmount());
                System.out.println("Осталось: " + (e.getRemainingAmount() - e.getRemainingAmount()));

                break;

            }
        }
    }

}
