package com.ali.auth.third.core.model;

public class User {
    public String avatarUrl;
    public String deviceTokenKey;
    public String deviceTokenSalt;
    public String nick;
    public String openId;
    public String openSid;
    public String userId;

    public String toString() {
        return "User [userId=" + this.userId + ", openId=" + this.openId + ", openSid= " + this.openSid + ", nick=" + this.nick + ",deviceTokenKey=" + (this.deviceTokenKey) + ",deviceTokenSalt=" + (this.deviceTokenSalt) + "]";
    }
}
