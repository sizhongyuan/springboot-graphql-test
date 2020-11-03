package com.derek.graphql.demo.mapper;

import com.derek.graphql.demo.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ArticleMapper {

    @Select("<script>" +
            "select * from articles " +
            "where titile = #{title}" +
            "</script>")
    Article findArticleByTitle(String title);
    @Select("<script>" +
            "select * from articles " +
            "where authorId = #{authorId}" +
            "</script>")
    List<Article> findArticlesByAuthorId(String authorId);
}
