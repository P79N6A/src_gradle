package com.bytedance.android.livesdk.chatroom.event;

import android.support.annotation.Keep;
import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.bytedance.android.live.base.model.user.User;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class UserProfileEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @IgnoreStyleCheck
    public String interactLogLabel;
    @IgnoreStyleCheck
    public String mClickUserPosition;
    @IgnoreStyleCheck
    public String mEventModule;
    @IgnoreStyleCheck
    public String mSource;
    @IgnoreStyleCheck
    public User user;
    @IgnoreStyleCheck
    public long userId;

    public void setClickUserPosition(String str) {
        this.mClickUserPosition = str;
    }

    public void setEventModule(String str) {
        this.mEventModule = str;
    }

    public UserProfileEvent(long j) {
        this.userId = j;
    }

    public UserProfileEvent(User user2) {
        if (user2 != null) {
            this.user = user2;
            return;
        }
        throw new RuntimeException("mUser cannot be null!");
    }

    public UserProfileEvent(User user2, String str) {
        this(user2);
        this.interactLogLabel = str;
    }
}
