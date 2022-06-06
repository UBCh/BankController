package lec12;

public class BankController {

    public static void main(String[] args) {
        Bank.addUser("myPassword");

    }

    public static void outputToConsoleAllUsers() {
        Bank.getDataUsers("myPassword");
    }


    public static void userIdLookup(long id) {

        User result = Bank.lookForId(id);
        if (result == null) {
            System.out.println("id не найден");
        } else {
            System.out.println(result);
        }

    }

    public static void searchBySurname(String surname) {
        var result = Bank.lookForSurName(surname);
        if (result != null) {
            System.out.println(result);}
           }
    public static void transferBetweenCards(long id1, long id2,int summa){
        Bank.getDataUsers("myPassword");
        Bank.transfer(id1,id2,summa);

    }



}



