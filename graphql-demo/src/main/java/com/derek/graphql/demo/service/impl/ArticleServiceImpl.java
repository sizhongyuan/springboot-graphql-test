package com.derek.graphql.demo.service.impl;

import com.derek.graphql.demo.entity.Article;
import com.derek.graphql.demo.mapper.ArticleMapper;
import com.derek.graphql.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public Article findArticleByTitle(String title) {
        return articleMapper.findArticleByTitle(title);
    }

    @Override
    public List<Article> findArticlesByAuthorId(String authorId) {
        return articleMapper.findArticlesByAuthorId(authorId);
    }
}
