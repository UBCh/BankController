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
                out.println("��� ������� ������� ������:");

                String tmp = scanner.nextLine();
                if (Bank.password(tmp)) {
                    break;
                } else {
                    System.exit(1);
                }
            }
        } else {

                System.out.println("����� �������");}
                while (true) {
                    String[] menu = {"1-�������� ������� �����", "2-��������� ����������", "3-����� ������� ����� �� id", "4-������� ����� �� �������", "5- ������� ��� ���� �������� � �������","100-���������� ���������"};
            for (String s : menu) {
                System.out.println(s);
            }
            switch (scanner.nextInt()) {
                case 1:
                    Bank.addUser();
                    break;
                case 2:
                    System.out.println("������� ����� �����, � ������� ������ ������� �������");
                    int numberCard1 = scanner.nextInt();
                    System.out.println("������� ����� �����, �� ������� ������ ������� �������");
                    int numberCard2 = scanner.nextInt();
                    System.out.println("������� �����, �� ������� ������ ������� �������");
                    int summa = scanner.nextInt();
                    transferBetweenCards(numberCard1, numberCard2, summa);
                    break;
                case 3:
                    System.out.println("������� ����� id ������������, �������� ������ �����");
                    long id = scanner.nextInt();
                    userIdLookup(id);
                    break;
                case 4:
                    System.out.println("������� ������� ������������, �������� ������ �����");
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
            out.println("������������ �� ������");
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



