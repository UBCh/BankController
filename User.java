package lec12;

public class User {

     private Info info;
    private Card card;
    private static long id = (long) (Math.random() * 999999999);
    private static String shortName;

    User() {
    }

    public Info getInfo() {
        return info;
    }

    public Card getCard() {
        return card;
    }

    public static long getId() {
        return id;
    }

    public static String getShortName() {
        return shortName;
    }

    static User createUser() {
        User user = new User();
        user.setUserInfo();
        user.setUserCard();
        return user;
    }

    void setUserInfo() {
        info = new Info();
        info.setInfo();
    }

    void setUserCard() {
        card = new Card();
        card.setCard();
    }


}
