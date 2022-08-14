public class Main {
    public static void main(String[] args) {
        CreditCard Palm = new CreditCard();
        Palm.amountOnAccount = 100;
        System.out.println(" Sum on Palm's account = " + Palm.amountOnAccount);
        Palm.accureAmount(40);
        System.out.println(" Sum on Palm's account = " + Palm.amountOnAccount);
    }
}
