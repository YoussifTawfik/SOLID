package com.solid.training.LiskovSubstitution;

public class PostManager {

    public static Post getPost(PostType postType) {

        switch (postType) {
            case TAG:
                return new TagPost();
            case MENTION:
                return new MentionPost();
            default:
                return new OriginalPost();
        }
    }
}
