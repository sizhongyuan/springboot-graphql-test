package com.derek.graphql.demo.service.impl;

import com.derek.graphql.demo.entity.User;
import com.derek.graphql.demo.mapper.UserMapper;
import com.derek.graphql.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByNickname(String nickname) {
        return userMapper.findUserByNickname(nickname);
    }

    @Override
    public User findById(String id) {
        return userMapper.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
