package com.csantana.menu;

import com.csantana.users.UserService;

import java.util.Scanner;

public class MenuService {

    private static UserService userService;

    private static Menu menu;

    public MenuService() {
        this.menu = new Menu();
        this.userService = new UserService();
    }


    public static void menuFunction(Menu menu) {
        Scanner scan = new Scanner(System.in);
        int selection = scan.nextInt();
        switch(selection) {
            case 1: userService.captureUserName();
            break;
        }
    }
}
