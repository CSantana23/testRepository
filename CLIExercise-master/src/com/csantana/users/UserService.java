package com.csantana.users;

import java.util.Scanner;

public class UserService {

    private static UserDAO userDAO;

    private static User createdUser;

    public UserService() {
        this.userDAO = new UserDAO();
    }

    public static int addUser(User user) {
        if(user.getFirstName().isBlank()) {
            throw new IllegalArgumentException("First name cannot be null or empty");
        } else if (user.getLastName().isBlank()){
            throw new IllegalArgumentException("Last name cannot be null or empty");
        } else if (user.getAge() < 18) {
            throw new IllegalArgumentException("The person booking the car needs to be 18 or older");
        } else if (user.getAddress().isBlank()) {
            throw new IllegalArgumentException("The address cannot be null or empty");
        }
        userDAO.saveUser(user);
        System.out.println("User " + user.getFirstName() + " " + user.getLastName() + " was saved.");
        //TODO: Add option to add more users
        return 1;
    }

    public String countUsers() {
        System.out.println("Here are how many users are saved: ");
        return userDAO.getUsers();
    }

    public static void captureUserName() {
        System.out.println("Let's start filling out your form so you can book your vehicle");
        Scanner firstname = new Scanner(System.in);
        Scanner lastName = new Scanner(System.in);
        Scanner age = new Scanner(System.in);
        Scanner address = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String userFirstName = firstname.nextLine();
        System.out.println("Please enter your last name: ");
        String userLastName = lastName.nextLine();
        System.out.println("Please enter your age: ");
        int userAge = age.nextInt();
        System.out.println("Please enter your address ");
        String userAddress = address.nextLine();
        System.out.println("Great here is the information you entered: ");
        System.out.print("First name: " + userFirstName + " last name: " + userLastName + " age: " + userAge + " address: " + userAddress);
        System.out.println();
        createdUser = new User(userFirstName, userLastName, userAge, userAddress);
        addUser(createdUser);
    }


}
