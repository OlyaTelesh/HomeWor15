import java.util.Random;

public class CreditCard {
    int accountNumber;
    double amountOnAccount;

    void accureAmount(double sum) {
        double plusSumOnCreditCard = sum;
        System.out.println("Received on account = " + sum); // сумма поступленеия на аккаунт
        amountOnAccount = amountOnAccount + sum;
    }
}