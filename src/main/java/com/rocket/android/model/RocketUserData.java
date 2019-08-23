package com.rocket.android.model;

import android.support.annotation.NonNull;

public final class RocketUserData {
    @NonNull
    private final String avatar_url;
    private long mobileId;
    @NonNull
    private final String phone;
    @NonNull
    private final String pinYinName;
    @NonNull
    private final String rocketNo;
    @NonNull
    private final String simplePY;
    private final long user_id;
    @NonNull
    private final String user_name;

    @NonNull
    public final String getAvatar_url() {
        return this.avatar_url;
    }

    public final long getMobileId() {
        return this.mobileId;
    }

    @NonNull
    public final String getPhone() {
        return this.phone;
    }

    @NonNull
    public final String getPinYinName() {
        return this.pinYinName;
    }

    @NonNull
    public final String getRocketNo() {
        return this.rocketNo;
    }

    @NonNull
    public final String getSimplePY() {
        return this.simplePY;
    }

    public final long getUser_id() {
        return this.user_id;
    }

    @NonNull
    public final String getUser_name() {
        return this.user_name;
    }

    public final void setMobileId(long j) {
        this.mobileId = j;
    }

    public RocketUserData(long j, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, long j2) {
        this.user_id = j;
        this.rocketNo = str;
        this.user_name = str2;
        this.pinYinName = str3;
        this.simplePY = str4;
        this.avatar_url = str5;
        this.phone = str6;
        this.mobileId = j2;
    }
}
