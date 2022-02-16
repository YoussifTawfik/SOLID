package com.solid.training.LiskovSubstitution;

public class LiskovMain {

    /*
    * If you have class B inherits from class A,
    * then class A should be replaceable by class B
    * without any changes
    * */

    public static void main(String[] args) {
        String postValue1="this is post";
        String postValue2="@this is post";

        // Strategy Design Pattern
        Post post=PostManager.getPost(PostType.TAG);
        post.createPost(postValue2);
        post=PostManager.getPost(PostType.MENTION);
        post.createPost(postValue1);
    }
}
