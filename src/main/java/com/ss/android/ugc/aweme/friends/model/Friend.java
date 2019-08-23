package com.ss.android.ugc.aweme.friends.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Field;

public class Friend extends User {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean invited;
    private boolean isFirstOne;
    @SerializedName("social_name")
    private String socialName;

    public String getSocialName() {
        return this.socialName;
    }

    public boolean isFirstOne() {
        return this.isFirstOne;
    }

    public boolean isInvited() {
        return this.invited;
    }

    public void setFirstOne(boolean z) {
        this.isFirstOne = z;
    }

    public void setInvited(boolean z) {
        this.invited = z;
    }

    public void setSocialName(String str) {
        this.socialName = str;
    }

    public Friend(String str) {
        this.socialName = str;
    }

    public static Friend copyFrom(User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, null, changeQuickRedirect, true, 46606, new Class[]{User.class}, Friend.class)) {
            return (Friend) PatchProxy.accessDispatch(new Object[]{user2}, null, changeQuickRedirect, true, 46606, new Class[]{User.class}, Friend.class);
        } else if (user2 == null) {
            return null;
        } else {
            if (user2 instanceof Friend) {
                return (Friend) user2;
            }
            Friend friend = new Friend(null);
            for (Field field : User.class.getDeclaredFields()) {
                if (((SerializedName) field.getAnnotation(SerializedName.class)) != null) {
                    field.setAccessible(true);
                    try {
                        field.set(friend, field.get(user2));
                    } catch (IllegalAccessException unused) {
                    }
                }
            }
            return friend;
        }
    }
}
