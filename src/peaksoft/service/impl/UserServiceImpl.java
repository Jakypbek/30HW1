package peaksoft.service.impl;

import peaksoft.exception.InvalidIDException;
import peaksoft.dao.UserDao;
import peaksoft.model.User;
import peaksoft.service.UserService;

import java.util.*;

public class UserServiceImpl implements UserService {

    private UserDao allUsers;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao allUsers) {
        this.allUsers = allUsers;
    }

    @Override
    public void addUser(User user) {
        this.allUsers.setAllUsers(user);
    }

    @Override
    public User getByID(int id) {
        List<User> list = new ArrayList<>(this.allUsers.getAllUsers());
        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(list.get(i).getId());
        }

        if (list1.contains(id)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == id) {
                    return list.get(i);
                }
            }
        } else {
            throw new InvalidIDException("В базе нет пользователя с ID: " + id);
        }
        return null;
    }

    @Override
    public void deleteByID(int id) {
        List<User> list = new ArrayList<>(this.allUsers.getAllUsers());
        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(list.get(i).getId());
        }

        if (list1.contains(id)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == id) {
                    allUsers.getAllUsers().remove(list.get(i));
                }
            }
        } else {
            throw new InvalidIDException("В базе нет пользователя с ID: " + id);
        }
    }

    @Override
    public UserDao getAllUsers() {
        return allUsers;
    }
}
