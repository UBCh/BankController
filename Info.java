package lec12;


import java.util.Scanner;

public class Info {

    private String name;
    private String surname;
    private Address address;

    Info() {
    }

    void setInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter surname: ");
        this.surname = scanner.nextLine();
        address = new Address();
        this.address.cetAddress(scanner);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Address getAddress() {
        return address;
    }
}





