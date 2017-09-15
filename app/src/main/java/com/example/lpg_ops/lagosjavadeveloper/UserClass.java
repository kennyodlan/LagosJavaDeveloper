package com.example.lpg_ops.lagosjavadeveloper;

/**
 * Created by LPG_OPS on 31-Aug-17.
 */

public class UserClass {
    private String gituserName;
    private String avatarUrl;
    private String gitUrl;

    public UserClass(String userName, String avatarUrl, String htmlUrl) {
        this.gituserName = userName;
        this.avatarUrl = avatarUrl;
        this.gitUrl = htmlUrl;

    }

    public String getUserName() {
        return gituserName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getHtmlUrl() {
        return gitUrl;
    }
}
