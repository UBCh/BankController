package lec12;

public class Bank {


    static final String bankPassword = "myPassword";


    public static void addUser(String password) {
        if (password.equals(bankPassword)) {
            User user = User.createUser();
            var mapUser = DataBD.hashmapAdd(user);
            System.out.print(mapUser.entrySet());
        } else {
            System.out.println("Wrong password");
        }
    }

    public static void getDataUsers(String password) {
        if (password.equals(bankPassword)) {

            System.out.println(DataBD.mapUser.entrySet());
        }
        System.out.println("������ ��������");
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
            System.out.println("������������ �� ������");
            return null;
        }
        return (User) result;

    }


    public static void transfer(long id1, long id2, int summa) {
        var result = DataBD.refill(id1, id2, summa);
        System.out.println("�������� ������� � ����� ������������ � id " + id1 + ",������ �����" + result[0] + "�� ����� ������������ � id" + id2 + "������ �����" + result[1]);
    }





}


