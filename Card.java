package lec12;


public class Card {

    private long cardNumber = (long) (Math.random() * 999999999);;
    private short cvv = (short) (100 + (Math.random() * 900));
    private int money=0;
    private long cardId=(long) (Math.random() * 999999999);
    Card() {
    }

    void setCard() {
       this.cardNumber = cardNumber;
       this.cvv = cvv;
           }

    public int getMoney() {
        return money;
    }

    public void setMoney(int babki) {
        money = babki;
    }

    public long getCardNumber() {
        return cardNumber;
    }
}