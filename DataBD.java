package lec12;

import java.util.*;


public class DataBD {


    public DataBD() {
    }


    public static HashMap hashmapAdd(User user, HashMap mapUser) {
        Long key = user.getId();
        mapUser.put(key, user);
        return mapUser;
    }

    public static RandomAccess LostSurname(String surname) {
        Collection<User> users = Bank.mapUser.values();
        ArrayList<User> resultArrayList= new ArrayList<>();
        for (User tmp : users) {
            var infoUser = tmp.getInfo();
            var surnameUser = infoUser.getSurname();
            if (surnameUser.equals(surnameUser)) {
                resultArrayList.add(tmp);
                        }
            if (resultArrayList.isEmpty()){ return null;}
            else { return resultArrayList;}

        }


        return null;
    }

    public static void ownerSearchByCardNumber(long cardNumber1) {
    }

    public static int[] refill(long id1, long id2, int summa) {
        User user1=Bank.mapUser.get(id1);
        User user2=Bank.mapUser.get(id2);
        var cardUser1 = user1.getCard();
        var cardUser2 = user2.getCard();
        var balansNumber1=cardUser1.getMoney();
        var balansNumber2=cardUser2.getMoney();
        cardUser1.setMoney(balansNumber1-summa);
        cardUser2.setMoney(balansNumber2-summa);
        int[] result = {balansNumber1,balansNumber2};
         return result;



        }
}
