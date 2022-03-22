package com.miCVGabriel.mypackage.service;

import com.miCVGabriel.mypackage.model.User;

import java.util.List;

public interface IUserService {
    public List<User> getUsers();

    public void saveUser(User u);

    public void deleteUser(Integer id);

    public User getUserByID(Integer id);
}
