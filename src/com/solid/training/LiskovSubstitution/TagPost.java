package com.solid.training.LiskovSubstitution;

public class TagPost implements Post {
    @Override
    public void createPost(String post) {
        System.out.format("Tag Post ------- %s -------- Saved successfully\n", post);
    }
}
