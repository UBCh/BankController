package lec12;

import java.util.Scanner;

public class Card {
    private static long cardNumber = (long) (Math.random() * 999999999);
    private static short cvv = (short) (100 + (Math.random() * 900));
//    private long userId;
//    private float money;


    Card() {
    }

    public void setCard() {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }
}

