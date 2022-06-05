package lec12;

import java.util.ArrayList;
import java.util.HashMap;

public class Bank {

    static HashMap<Long, ArrayList<Object>> mapUser = new HashMap<Long, ArrayList<Object>>();

    static final String bankPassword = "myPassword";


    public static void addUser(String password) {
        if (password.equals(bankPassword)) {
            User user = User.createUser();
            mapUser = DataBD.hashmapAdd(mapUser, user);
            System.out.print(mapUser);
        } else {
            System.out.println("Wrong password");
        }
    }

    public static void getDataUsers(String password) {
        if (password.equals(bankPassword)) {

            System.out.println(mapUser.entrySet());
        }
        System.out.println("пароль неверный");
    }

    public static ArrayList<Object> lookForId(long id) {
        if (mapUser.containsKey(id)) {
            return mapUser.get(id);
        }
        return null;
    }

    public User lookForSurName(String surname) {

        return null;
    }


}

