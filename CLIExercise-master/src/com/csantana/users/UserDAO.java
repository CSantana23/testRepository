package com.csantana.users;

import java.util.Arrays;

public class UserDAO {

    private static final User[] users;
    private static int count = 0;

    private User user;


    static {
        users = new User[20];
    }

    public static String getUsers() {
        User[] output = new User[count];
        for (int i = 0; i < count; i++) {
            output[i] = users[i];
        }
        return Arrays.toString(output);
    }

    public static void saveUser(User user){
        users[count] = user;
        count++;
    }

}
