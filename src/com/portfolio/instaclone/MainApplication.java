package com.portfolio.instaclone;

// Import our User files
import com.portfolio.instaclone.user.model.User;
import com.portfolio.instaclone.user.service.UserService;

// Import our Post files
import com.portfolio.instaclone.post.model.Post;
import com.portfolio.instaclone.post.controller.PostController;

public class MainApplication {

    public static void main(String[] args) {
        System.out.println("--- Starting InstaClone App ---");

        // 1. Create a user and log them in
        User myUser = new User("java_learner_99");
        UserService userService = new UserService();
        userService.login(myUser);

        System.out.println("-------------------------------");

        // 2. Create a new post
        Post myPost = new Post("Finally understanding Java Packages!");
        System.out.println("New post created: " + myPost.caption);

        System.out.println("-------------------------------");

        // 3. User clicks 'Like' on the post
        PostController postController = new PostController();
        postController.clickLikeButton(myPost);
    }
}