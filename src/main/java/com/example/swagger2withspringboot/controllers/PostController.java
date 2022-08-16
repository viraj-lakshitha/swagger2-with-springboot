package com.example.swagger2withspringboot.controllers;

import com.example.swagger2withspringboot.models.Post;
import com.example.swagger2withspringboot.services.PostService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/v1/articles")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    @ApiOperation(value = "Get all posts", response = List.class)
    public List<Post> getPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Get post by post id", response = Post.class)
    public Post getPostById(@PathVariable int id) {
        return postService.getPostById(id);
    }

    @PostMapping()
    @ApiOperation(value = "Create new post", response = Post.class)
    public Post createNewPost(@RequestBody Post newPost) {
        return postService.createPost(newPost);
    }
}