package lec12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.*;

public class BankController {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        if (!Bank.password("myPassword")) {
            for (int i = 0; i < 3; i++) {
                out.println("Для доступа введите пароль:");

                String tmp = scanner.nextLine();
                if (Bank.password(tmp)) {
                    break;
                } else {
                    System.exit(1);
                }
            }
        } else {

                System.out.println("выбор функции");}
                while (true) {
                    String[] menu = {"1-добавить клиента банка", "2-выполнить транзакцию", "3-найти клиента банка по id", "4-клиента банка по фамилии", "5- вывести всю базу клиентов в консоль","100-остановить программу"};
            for (String s : menu) {
                System.out.println(s);
            }
            switch (scanner.nextInt()) {
                case 1:
                    Bank.addUser();
                    break;
                case 2:
                    System.out.println("введите номер карты, с которой хотите сделать перевод");
                    int numberCard1 = scanner.nextInt();
                    System.out.println("введите номер карты, на которую хотите сделать перевод");
                    int numberCard2 = scanner.nextInt();
                    System.out.println("введите сумму, на которую хотите сделать перевод");
                    int summa = scanner.nextInt();
                    transferBetweenCards(numberCard1, numberCard2, summa);
                    break;
                case 3:
                    System.out.println("введите номер id пользователя, которого хотите найти");
                    long id = scanner.nextInt();
                    userIdLookup(id);
                    break;
                case 4:
                    System.out.println("введите фамилию пользователя, которого хотите найти");
                     String surname = scanner.next();
                    searchBySurname(surname);
                    break;
                case 5:
                    outputToConsoleAllUsers();
                    break;
                case 100:   System.exit(1);

            }
        }

    }

    public static void outputToConsoleAllUsers() {
        Bank.getDataUsers();
    }


    public static void userIdLookup(long id) {

        User result = Bank.lookForId(id);
        if (result == null) {
            out.println("пользователь не найден");
        } else {
            out.println(result);
        }

    }

    public static void searchBySurname(String surname) {
        ArrayList<User> result = Bank.lookForSurName(surname);
        if (result != null) {
            System.out.println(result);}}



           public static void transferBetweenCards(long id1, long id2,int summa){
        id1=DataBD.ownerSearchByCardNumber(id1);
        id2=DataBD.ownerSearchByCardNumber(id2);
        Bank.transfer(id1,id2,summa);
    }



}



