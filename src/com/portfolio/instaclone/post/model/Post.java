package com.portfolio.instaclone.post.model;

public class Post {
    public String caption;
    public int likes;

    // Constructor
    public Post(String caption) {
        this.caption = caption;
        this.likes = 0; // Starts with zero likes
    }
}