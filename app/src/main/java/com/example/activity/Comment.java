package com.uamrfarooq.i210497.models;

public class Comment {
    private String id;
    private String postId;
    private String userId;
    private String username;
    private String userProfileUrl;
    private String text;
    private long timestamp;

    // Required for Firebase
    public Comment() {
    }

    public Comment(String id, String postId, String userId, String username, String userProfileUrl, 
                  String text, long timestamp) {
        this.id = id;
        this.postId = postId;
        this.userId = userId;
        this.username = username;
        this.userProfileUrl = userProfileUrl;
        this.text = text;
        this.timestamp = timestamp;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserProfileUrl() {
        return userProfileUrl;
    }

    public void setUserProfileUrl(String userProfileUrl) {
        this.userProfileUrl = userProfileUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
