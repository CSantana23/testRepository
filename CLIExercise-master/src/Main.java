import com.csantana.menu.Menu;
import com.csantana.menu.MenuService;
import com.csantana.users.User;
import com.csantana.users.UserService;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        /* User cesar = new User("Cesar","Santana",39,"MyAddress");
        UserService userService = new UserService();
        System.out.println(userService.addUser(cesar));
        System.out.println(userService.countUsers());*/

        //UserService userService = new UserService();
        //userService.captureUserName();
        //System.out.println(userService.countUsers());

        Menu menu = new Menu();
        System.out.println(menu);
        MenuService.menuFunction(menu);
        UserService userService = new UserService();
        System.out.println(userService.countUsers());


    }
}