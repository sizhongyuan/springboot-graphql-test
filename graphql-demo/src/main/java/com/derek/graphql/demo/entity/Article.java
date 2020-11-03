package com.derek.graphql.demo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Article {
    private String id;
    private String authorId;
    private String title;
    private String content;
    private Date createBy;
    private Integer thumbUp;
}
