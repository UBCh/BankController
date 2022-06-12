package lec12;

import java.util.*;


public class DataBD {
    static HashMap<Long, User> mapUser= new HashMap<>();

    public DataBD() {
    }


    public static HashMap hashmapAdd(User user) {
        Long key = user.getId();
      mapUser.put(key, user);
        return mapUser;
    }

    public static ArrayList<User> LostSurname(String surname) {
        Collection<User> users = mapUser.values();
        ArrayList<User> resultArrayList= new ArrayList<>();
        for (User tmp : users) {
            var infoUser = tmp.getInfo();
             ;
            if ((infoUser.getSurname()).equals(surname)) {
                resultArrayList.add(tmp);
                        }
            if (resultArrayList.isEmpty()){ return null;}
            else { return resultArrayList;}

        }


        return null;
    }

    public static Long ownerSearchByCardNumber(long cardNumber1) {
        Collection<User> users = mapUser.values();
           for (User tmp : users) {
           Card cardUser = tmp.getCard();
            long numberCa = cardUser.getCardNumber();
            if (numberCa==cardNumber1) {
                Collection<Long> keys = mapUser.keySet();
                for (Long tmpKey : keys) {
                    User tmp2 = mapUser.get(tmpKey);
                    if (tmp2.equals(tmp)) {
                        Long idUser = tmp.getId();
                      return idUser;
                    }
                }
            }

        }
        return null;
    }

    public static int[] refill(long id1, long id2, int summa) {
        User user1=mapUser.get(id1);
        User user2=mapUser.get(id2);
        var cardUser1 = user1.getCard();
        var cardUser2 = user2.getCard();
        var balansNumber1=cardUser1.getMoney();
        var balansNumber2=cardUser2.getMoney();
        int i=balansNumber1-summa;
        int j=balansNumber2+summa;
        cardUser1.setMoney(i);
        cardUser2.setMoney(j);
        int[] result = {cardUser1.getMoney(),cardUser2.getMoney()};
         return result;



        }
}
