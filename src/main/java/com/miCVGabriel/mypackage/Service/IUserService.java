package com.miCVGabriel.mypackage.Service;

import com.miCVGabriel.mypackage.Model.User;

import java.util.List;

public interface IUserService {
    public List<User> getUsers();

    public void saveUser(User u);

    public void deleteUser(Integer id);

    public User getUserByID(Integer id);
}
