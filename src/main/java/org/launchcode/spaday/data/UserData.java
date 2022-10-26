package org.launchcode.spaday.data;

import org.launchcode.spaday.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    private static final List<User> users = new ArrayList<>();

    public static List<User> getAll() {
        return users;
    }

    public static void add(User user) {
        users.add(user);
    }

    public static User getById(int id) {
        for (User user: users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
