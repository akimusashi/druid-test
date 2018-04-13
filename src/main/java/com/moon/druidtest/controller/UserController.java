package com.moon.druidtest.controller;

import com.moon.druidtest.entity.User;
import com.moon.druidtest.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private UserJPA userJPA;

    @Autowired
    public UserController(UserJPA userJPA) {
        this.userJPA = userJPA;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> list() {
        return userJPA.findAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public User save(User user) {
        return userJPA.save(user);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public List<User> delete(Integer id) {
        userJPA.deleteById(id);
        return userJPA.findAll();
    }
}
