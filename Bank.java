package lec12;

import java.util.HashMap;

public class Bank {

    static HashMap<Long, User> mapUser;
    static final String bankPassword = "myPassword";

     public static boolean password(String password){
         if (password.equals(bankPassword)){ return true;}
         else {
             System.out.println("Wrong password");
             return false;
         }
     }



    public static void setMapUser(HashMap mapUser) {
        Bank.mapUser = mapUser;
    }

    public static void addUser() {
         var tmp= new HashMap<>(); ;
           User user = User.createUser();
           setMapUser( DataBD.hashmapAdd(user,tmp));
           System.out.print(mapUser.toString());

    }

    public static void getDataUsers() {
        System.out.println(mapUser.entrySet());
           }

    public static User lookForId(long id) {
        if (mapUser.containsKey(id)) {
            return mapUser.get(id);
        }
        return null;
    }

    public static User lookForSurName(String surname) {
        String lost = surname;
        var result = DataBD.LostSurname(surname);
        if (result == null) {
            System.out.println("пользователь не найден");
            return null;
        }
        return (User) result;

    }


    public static void transfer(long id1, long id2, int summa) {
        var result = DataBD.refill(id1, id2, summa);
        System.out.println("выполнен перевод с карты пользователя с id " + id1 + ",баланс карты" + result[0] + "на карту пользователя с id" + id2 + "баланс карты" + result[1]);
    }





}


