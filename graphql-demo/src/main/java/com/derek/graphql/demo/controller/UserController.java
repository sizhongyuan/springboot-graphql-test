package com.derek.graphql.demo.controller;

import com.derek.graphql.demo.entity.User;
import com.derek.graphql.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/query/{nickname}")
    public User findUserByNickname(@PathVariable("nickname") String nickname){

        return userService.findUserByNickname(nickname);

    }

}
