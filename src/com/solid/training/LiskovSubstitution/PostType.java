package com.solid.training.LiskovSubstitution;

public enum PostType {

    ORININAL(""),TAG("#"),MENTION("@");

    private final String value;
    PostType(String type){
        this.value=type;
    }

    public String getValue(){
        return this.value;
    }
}
