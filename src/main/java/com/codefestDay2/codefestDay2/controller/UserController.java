package com.codefestDay2.codefestDay2.controller;

import com.codefestDay2.codefestDay2.model.User;
import com.codefestDay2.codefestDay2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAllUsers(Model model){

        return userService.getAllUsers();
    }

    @PostMapping
    public ModelAndView saveUser(User user, ModelMap model){
         userService.saveUser(user);

        return new ModelAndView("redirect:/index");
    }
}
