package com.example.swagger2withspringboot.services;

import com.example.swagger2withspringboot.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    static List<Post> posts = new ArrayList<>();

    public List<Post> getAllPosts() {
        posts.add(new Post(1, "SpringBoot-1", "Lorem Ipsum 1", "Open JDK 1"));
        posts.add(new Post(2, "SpringBoot-2", "Lorem Ipsum 2", "Open JDK 2"));
        posts.add(new Post(3, "SpringBoot-3", "Lorem Ipsum 3", "Open JDK 3"));
        return posts;
    }

    public Post getPostById(int postId) {
        return posts.stream().filter(post -> post.getId() == postId).findFirst().get();
    }

    public Post createPost(Post newPost) {
        posts.add(newPost);
        return newPost;
    }
}