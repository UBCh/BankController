package lec12;

public class BankController {

    public static void main(String[] args) {
        Bank.addUser("myPassword");

    }

    public static void outputToConsoleAllUsers() {

        Bank.getDataUsers("myPassword");
    }


    public static void userIdLookup(long id) {

        var result = Bank.lookForId(id);
        if (result == null) {
            System.out.println("id не найден");
        } else {
            System.out.println(result);
        }

    }


}



