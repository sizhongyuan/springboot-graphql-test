package com.derek.graphql.demo.mapper;

import com.derek.graphql.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("<script>" +
            "select * from users " +
            "<where>" +
            "   and nickname=#{nickname}" +
            "</where>" +
            "</script>"
    )
    User findUserByNickname(String nickname);
    @Select("<script>" +
            "select * from users " +
            "<where>" +
            "   and id=#{id}" +
            "</where>" +
            "</script>"
    )
    User findById(String id);
    @Select("<script>" +
            "select * from users " +
            "</script>"
    )
    List<User> findAll();
}
