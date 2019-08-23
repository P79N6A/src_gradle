package com.ss.android.ugc.aweme.story.comment.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

public class c extends com.ss.android.ugc.aweme.base.api.c implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isFirstFriend;
    private boolean isFirstPartyFriend;
    private boolean isFirstPartyFriendWithoutFriend;
    @SerializedName("is_friend")
    boolean isFriend;
    @SerializedName("recommend_reason")
    String recommendReason;
    @SerializedName("user")
    User user;

    public boolean getIsFriend() {
        return this.isFriend;
    }

    public String getRecommendReason() {
        return this.recommendReason;
    }

    public User getUser() {
        return this.user;
    }

    public boolean isFirstPartyFriendWithoutFriend() {
        return this.isFirstPartyFriendWithoutFriend;
    }

    public Boolean isFirstFriend() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 82890, new Class[0], Boolean.class)) {
            return Boolean.valueOf(this.isFirstFriend);
        }
        return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 82890, new Class[0], Boolean.class);
    }

    public Boolean isFirstPartyFriend() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 82892, new Class[0], Boolean.class)) {
            return Boolean.valueOf(this.isFirstPartyFriend);
        }
        return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 82892, new Class[0], Boolean.class);
    }

    public void setFirstPartyFriendWithoutFriend(boolean z) {
        this.isFirstPartyFriendWithoutFriend = z;
    }

    public void setIsFriend(boolean z) {
        this.isFriend = z;
    }

    public void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public void setUser(User user2) {
        this.user = user2;
    }

    public void setFirstFriend(Boolean bool) {
        if (PatchProxy.isSupport(new Object[]{bool}, this, changeQuickRedirect, false, 82891, new Class[]{Boolean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bool}, this, changeQuickRedirect, false, 82891, new Class[]{Boolean.class}, Void.TYPE);
            return;
        }
        this.isFirstFriend = bool.booleanValue();
    }

    public void setFirstPartyFriend(Boolean bool) {
        if (PatchProxy.isSupport(new Object[]{bool}, this, changeQuickRedirect, false, 82893, new Class[]{Boolean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bool}, this, changeQuickRedirect, false, 82893, new Class[]{Boolean.class}, Void.TYPE);
            return;
        }
        this.isFirstPartyFriend = bool.booleanValue();
    }
}
