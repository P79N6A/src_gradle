package com.ss.android.ugc.aweme.story.model;

import android.support.annotation.Keep;
import com.bytedance.common.utility.StringUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

@Keep
public class Story implements Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;
    List<Aweme> awemes;
    @SerializedName("skylight_display_tag")
    public String skyLightDisplayTag;
    @SerializedName("status")
    int status;
    @SerializedName("type")
    public int type;
    @SerializedName("update_time")
    long updateTime;
    @SerializedName("user_info")
    User userInfo;

    public void setRead() {
        this.status = 1;
    }

    public List<Aweme> getAwemes() {
        return this.awemes;
    }

    public int getStatus() {
        return this.status;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public User getUserInfo() {
        return this.userInfo;
    }

    public boolean isRead() {
        if (this.status == 1) {
            return true;
        }
        return false;
    }

    public boolean isStory() {
        if (this.type == 0) {
            return true;
        }
        return false;
    }

    public boolean isFollowing() {
        if (this.type == 2) {
            return true;
        }
        return false;
    }

    public boolean isNewLiveType() {
        if (this.type == 5 || this.type == 6) {
            return true;
        }
        return false;
    }

    public boolean isLive() {
        if (this.type == 1 || this.type == 5 || this.type == 6) {
            return true;
        }
        return false;
    }

    public Story clone() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 84802, new Class[0], Story.class)) {
            return (Story) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 84802, new Class[0], Story.class);
        }
        Story story = null;
        try {
            story = (Story) super.clone();
        } catch (CloneNotSupportedException unused) {
        }
        return story;
    }

    public String getLiveUid() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 84799, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 84799, new Class[0], String.class);
        } else if (this.userInfo == null) {
            return "";
        } else {
            return this.userInfo.getLiveUid();
        }
    }

    public String getUid() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 84800, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 84800, new Class[0], String.class);
        } else if (getUserInfo() == null) {
            return null;
        } else {
            return getUserInfo().getUid();
        }
    }

    public boolean isMine() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 84801, new Class[0], Boolean.TYPE)) {
            return StringUtils.equal(getUid(), d.a().getCurUserId());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 84801, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 84798, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 84798, new Class[0], String.class);
        }
        return "Story{status=" + this.status + ", userInfo=" + this.userInfo + '}';
    }

    public void setAwemes(List<Aweme> list) {
        this.awemes = list;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public void setUserInfo(User user) {
        this.userInfo = user;
    }
}
