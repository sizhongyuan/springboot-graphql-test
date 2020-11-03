package com.derek.graphql.demo.resolver;

import com.derek.graphql.demo.entity.Article;
import com.derek.graphql.demo.entity.User;
import com.derek.graphql.demo.service.ArticleService;
import com.derek.graphql.demo.service.UserService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    @Autowired
    private ArticleService articleService;
    @Autowired
    private UserService userService;

    public Article article(String title) {
        return articleService.findArticleByTitle(title);
    }

    public User user(String nickname) {
        return userService.findUserByNickname(nickname);
    }

    public List<User> users() {
        System.out.println("user1111");
        return userService.findAll();
    }
}
