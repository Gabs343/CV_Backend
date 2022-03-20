package com.miCVGabriel.mypackage.Controller;

import com.miCVGabriel.mypackage.Model.User;
import com.miCVGabriel.mypackage.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/users/findAll")
    public List<User> findAllUsers(){
        return iUserService.getUsers();
    }

    @GetMapping("/users/find/{id}")
    public User findUser(@PathVariable Integer id){
        return iUserService.findUser(id);
    }

    @PostMapping("/users/create")
    public String createUser(@RequestBody User u){
        iUserService.saveUser(u);
        return "user saved";
    }

    @PutMapping("/users/edit/{id}")
    public User editUser(@PathVariable Integer id, @RequestBody User u){
        User editedUser = iUserService.findUser(id);

        editedUser.setImg(u.getImg());
        editedUser.setName(u.getName());
        editedUser.setTitle(u.getTitle());
        editedUser.setDescription(u.getDescription());
        editedUser.setPassword(u.getPassword());

        iUserService.saveUser(editedUser);

        return editedUser;
    }

    @DeleteMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable Integer id){
        iUserService.deleteUser(id);
        return "User deleted";
    }
}
