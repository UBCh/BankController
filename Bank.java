package lec12;

import java.util.ArrayList;

public class Bank {


    static final String bankPassword = "myPassword";

     public static boolean password(String password){
         if (password.equals(bankPassword)){ return true;}
         else {
             System.out.println("Wrong password");
             return false;
         }
     }





    public static void addUser() {
         User user=new User();
          user=User.createUser();
           DataBD.hashmapAdd(user);
           System.out.print(DataBD.mapUser.toString());

    }

    public static void getDataUsers() {
        System.out.println(DataBD.mapUser.entrySet());
           }

    public static User lookForId(long id) {
        if (DataBD.mapUser.containsKey(id)) {
            return DataBD.mapUser.get(id);
        }
        return null;
    }

    public static ArrayList<User> lookForSurName(String surname) {
        ArrayList<User> result = DataBD.LostSurname(surname);
        if (result == null) {
            System.out.println("������������ �� ������");
            return null;
        }
        return  result;

    }


    public static void transfer(long id1, long id2, int summa) {
        var result = DataBD.refill(id1, id2, summa);
        System.out.println("�������� ������� � ����� ����� " + id1 + " , ������ ����� " + result[0] + "�� ����� ����� " + id2 + " ������ ����� " + result[1]);
    }





}


