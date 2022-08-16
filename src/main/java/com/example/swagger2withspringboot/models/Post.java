package com.example.swagger2withspringboot.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

@ApiModel(description = "Details about the post")
public class Post {
    @ApiModelProperty(notes = "Unique id for the post reference")
    private int id;

    @ApiModelProperty(notes = "Title of the post")
    private String title;

    @ApiModelProperty(notes = "Content of the post (max limit = 1000 words)")
    private String content;

    @ApiModelProperty(notes = "Author of the post")
    private String author;

    public Post() {
    }

    public Post(int id, String title, String content, String author) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}