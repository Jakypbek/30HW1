package peaksoft.dao;

import peaksoft.model.User;

import java.util.HashSet;
import java.util.Set;

public class UserDao {

    private Set<User> allUsers = new HashSet<>();

    public UserDao() {
    }

    public UserDao(Set<User> allUsers) {
        this.allUsers = allUsers;
    }

    public Set<User> getAllUsers() {
        return allUsers;
    }

    public void setAllUsers(User user) {
        this.allUsers.add(user);
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "allUsers=" + allUsers +
                '}';
    }
}
