package com.vermaji.hangup.models;

public class Post {
    private String userName;
    private String postCaption;
    private String postLikes;
    private String userProfile;
    private String postImageUrl;

    public Post() {

    }

    public Post(String userName, String postCaption, String postLikes, String userProfile, String postImageUrl) {
        this.userName = userName;
        this.postCaption = postCaption;
        this.postLikes = postLikes;
        this.userProfile = userProfile;
        this.postImageUrl = postImageUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPostCaption() {
        return postCaption;
    }

    public void setPostCaption(String postCaption) {
        this.postCaption = postCaption;
    }

    public String getPostLikes() {
        return postLikes;
    }

    public void setPostLikes(String postLikes) {
        this.postLikes = postLikes;
    }

    public String getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
    }

    public String getPostImageUrl() {
        return postImageUrl;
    }

    public void setPostImageUrl(String postImageUrl) {
        this.postImageUrl = postImageUrl;
    }
}
