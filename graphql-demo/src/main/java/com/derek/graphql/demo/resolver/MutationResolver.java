package com.derek.graphql.demo.resolver;

import com.derek.graphql.demo.entity.Article;
import com.derek.graphql.demo.entity.User;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class MutationResolver implements GraphQLMutationResolver {

    public User addUser(String mail, String nickname, String password) {
        return null;
    }

    public Article addArticle(String title, String content, String authorId) {
        return null;
    }
}