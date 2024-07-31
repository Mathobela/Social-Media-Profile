package com.social.media.profile.SocialMediaProfile.controller;

import com.social.media.profile.SocialMediaProfile.dao.UserDaoService;
import com.social.media.profile.SocialMediaProfile.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {
    @Autowired
    public UserDaoService userDaoService;

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return userDaoService.getAll();
    }

    @GetMapping("/user/id/{id}")
    public User retrieveUser(@PathVariable Integer id) {
        return userDaoService.getById(id);
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User user) {
        userDaoService.save(user);
    }

    @PutMapping("/edit")
    public void update(@RequestBody User user) {
        //userDaoService.update(user);
    }

    @DeleteMapping("/delete/id/{id}")
    public void delete(@PathVariable Integer id) {
        userDaoService.deleteById(id);
    }
}
