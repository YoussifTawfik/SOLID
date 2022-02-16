package com.fawry.solid.training.LiskovSubstitution;

public class OriginalPost implements Post{

    @Override
    public void createPost(String post) {
        System.out.format("Original Post ------- %s -------- Saved successfully\n",post);
    }
}
