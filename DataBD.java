package lec12;

import java.util.ArrayList;
import java.util.HashMap;

public class DataBD {
    private static User user;

    public DataBD() {
    }

    public static HashMap<Long, ArrayList<Object>> hashmapAdd(HashMap hashMap, User user) {
        Long key = User.getId();
        ;
        hashMap.put(key, user);
        return hashMap;
    }

}
