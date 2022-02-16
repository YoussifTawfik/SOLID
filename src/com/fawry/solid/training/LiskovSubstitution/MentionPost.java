package com.fawry.solid.training.LiskovSubstitution;

public class MentionPost implements Post{
    @Override
    public void createPost(String post) {
        System.out.format("Mention Post ------- %s -------- Saved successfully\n",post);
    }
}
