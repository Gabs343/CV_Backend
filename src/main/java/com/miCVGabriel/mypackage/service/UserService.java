package com.miCVGabriel.mypackage.service;

import com.miCVGabriel.mypackage.model.User;
import com.miCVGabriel.mypackage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {return userRepository.findAll();}

    @Override
    public User getUserByID(Integer id) {return userRepository.getById(id);}

    @Override
    public void saveUser(User u) {userRepository.save(u);}

    @Override
    public void deleteUser(Integer id) {userRepository.deleteById(id);}
}
