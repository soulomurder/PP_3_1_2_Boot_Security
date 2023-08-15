package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {


    List<User> getAllUsers();

    User findByUsername(String username);


    Optional<User> findUserById(Long id);

    void saveUser(User user);

    void updateUser(Long id, User user);

    void delete(Long id);
}