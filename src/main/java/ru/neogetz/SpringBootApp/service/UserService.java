package ru.neogetz.SpringBootApp.service;

import ru.neogetz.SpringBootApp.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
    void updateUser(int id, User updateUser);
    void deleteUser(int id);
    User showUser(int id);
}
