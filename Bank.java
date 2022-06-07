package lec12;

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
           User user = User.createUser();
            var mapUser = DataBD.hashmapAdd(user);
            System.out.print(mapUser.entrySet());

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


