public class Main {
    public static void main(String[] args) {
        CreditCard Palm = new CreditCard();
        Palm.amountOnAccount = 100;
        Palm.accountNumber = 1000;
        Palm.accureAmount(400);

        CreditCard Saint = new CreditCard();
        Saint.amountOnAccount = 50;
        Saint.accountNumber = 986;
        Saint.accureAmount(65);

        CreditCard Lyi =new CreditCard();
        Lyi.amountOnAccount =15006;
        Lyi.accountNumber = 436;
        Lyi.minusSum(4);

        Palm.infoAbout();
        Saint.infoAbout();
        Lyi.infoAbout();
    }

}
