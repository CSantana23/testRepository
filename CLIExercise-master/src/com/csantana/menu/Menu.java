package com.csantana.menu;

import com.csantana.users.UserService;

public class Menu {

    private final String menu = "1️⃣ - Book Car " + '\n' + "2️⃣ - View All User Booked Cars " + '\n' + "3️⃣ - View All Bookings " + '\n' +"4️⃣ - View Available Cars "+ '\n'+"5️⃣ - View Available Electric Cars " + '\n'+"6️⃣ - View all users "+ '\n'+"7️⃣ - Exit ";


    public Menu() {
        System.out.println(menu);
    }


}
