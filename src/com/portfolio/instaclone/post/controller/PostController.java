package com.portfolio.instaclone.post.controller;

import com.portfolio.instaclone.post.model.Post;
import com.portfolio.instaclone.post.service.PostService;

public class PostController {
    
    public void clickLikeButton(Post post) {
        System.out.println("Controller: User clicked the like button for '" + post.caption + "'");
        
        // The controller tells the service to do the actual work
        PostService service = new PostService();
        service.likePost(post);
    }
}