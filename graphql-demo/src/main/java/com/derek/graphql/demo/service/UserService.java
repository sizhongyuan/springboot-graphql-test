package com.derek.graphql.demo.service;

import com.derek.graphql.demo.entity.User;

import java.util.List;

public interface UserService {

    User findUserByNickname(String nickname);

    User findById(String id);

    List<User> findAll();

}
