package peaksoft.service;

import peaksoft.dao.UserDao;
import peaksoft.model.User;

public interface UserService {

    void addUser(User user);

    User getByID(int id);

    void deleteByID(int id);

    UserDao getAllUsers();

}
