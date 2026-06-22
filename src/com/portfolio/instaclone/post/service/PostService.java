package com.portfolio.instaclone.post.service;

import com.portfolio.instaclone.post.model.Post;

public class PostService {
    
    public void likePost(Post post) {
        post.likes = post.likes + 1;
        System.out.println("Service logic ran: Post likes updated to " + post.likes);
    }
}