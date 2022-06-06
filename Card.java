package lec12;

import java.util.Scanner;


public class Card {

    private long cardNumber = (long) (Math.random() * 999999999);;
    private short cvv = (short) (100 + (Math.random() * 900));
    private int money=0;
    Card() {
    }

    void setCard() {
       this.cardNumber = cardNumber;
       this.cvv = cvv;
           }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}