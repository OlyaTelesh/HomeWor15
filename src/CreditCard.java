import java.util.Random;

public class CreditCard {
    int accountNumber;
    double amountOnAccount;

    void accureAmount(double sum) {
        double plusSumOnCreditCard = sum;
        System.out.println("Received on account = " + sum); // сумма поступленеия на аккаунт
        amountOnAccount = amountOnAccount + sum;
    }
    void minusSum(double minus) {
        if (minus > amountOnAccount) {
            System.out.println("Error, sum is so big");
        } else {
            System.out.println("Withdrawal amount =" + minus);// выводит сумму снятия
            amountOnAccount = amountOnAccount - minus;
        }
    }
    void infoAbout () {
        System.out.println("Account number is " + accountNumber +", sum on account is "+amountOnAccount);
    }
}
