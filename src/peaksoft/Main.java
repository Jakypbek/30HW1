package peaksoft;

import peaksoft.dao.UserDao;
import peaksoft.model.User;
import peaksoft.service.UserService;
import peaksoft.service.impl.UserServiceImpl;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // 9) Main методдо 3 user тузунуз idлери 1,2,3 болсун.
        Set<User> allUsers = new HashSet<>();
        allUsers.add(new User(1, "Aktan", 23, Gender.MALE));
        allUsers.add(new User(2, "Akylai", 20, Gender.FEMALE));
        allUsers.add(new User(3, "Osmon", 31, Gender.MALE));

        // 10) Аларды биздин базага кошунуз.
        UserDao userDao = new UserDao(allUsers);

        UserService userService = new UserServiceImpl(userDao);

        // 11) 1 деген id менен userди таап консольго чыгарыныз.
        System.out.println(userService.getByID(1));

        // 12) Эгер ал id жок болсо анда RunTimeException кармасын.
        // System.out.println(userService.getByID(4));

        // 14) Баардык userлерди консольго чыгарыныз.
        System.out.println(userService.getAllUsers());

        // 15) 2 деген id менен userди очурунуз.
        userService.deleteByID(2);

        // 16) Баардык userлерди консольго чыгарыныз.
        System.out.println(userService.getAllUsers());


    }
}
