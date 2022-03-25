package com.miCVGabriel.mypackage.controller;

import com.miCVGabriel.mypackage.model.User;
import com.miCVGabriel.mypackage.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/users")
    public List<User> findAllUsers(){
        return iUserService.getUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserByID(@PathVariable Long id){
        return iUserService.getUserByID(id);
    }

    @PostMapping("/users")
    public String createUser(@RequestBody User u){
        iUserService.saveUser(u);
        return "user saved";
    }

    @PutMapping("/users/{id}")
    public User editUser(@PathVariable Long id, @RequestBody User u){
        User editedUser = iUserService.getUserByID(id);

        editedUser.setImg(u.getImg());
        editedUser.setName(u.getName());
        editedUser.setTitle(u.getTitle());
        editedUser.setDescription(u.getDescription());
        editedUser.setPassword(u.getPassword());

        iUserService.saveUser(editedUser);

        return editedUser;
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable Long id){
        iUserService.deleteUser(id);
        return "User deleted";
    }
}
