package com.derek.graphql.demo.service;

import com.derek.graphql.demo.entity.Article;

import java.util.List;

public interface ArticleService {

    Article findArticleByTitle(String title);

    List<Article> findArticlesByAuthorId(String authorId);
}
