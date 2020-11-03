package com.derek.graphql.demo.resolver;

import com.derek.graphql.demo.entity.Article;
import com.derek.graphql.demo.entity.User;
import com.derek.graphql.demo.service.UserService;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArticleResolver implements GraphQLResolver<Article> {

    @Autowired
    private UserService userService;

    public User author(Article article) {

        return userService.findById(article.getAuthorId());
    }


}
