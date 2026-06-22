package com.portfolio.instaclone.user.service;

// We have to import the User model because it's in a different package!
import com.portfolio.instaclone.user.model.User;

public class UserService {
    
    public void login(User user) {
        System.out.println(user.username + " has logged into the app.");
    }
}