package com.ss.android.ugc.aweme.story.feed.view.profile;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import java.io.Serializable;

@Keep
public class ProfileEntity extends User implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isMain;
    private boolean isMeetUser = true;
    private UserStory userStory;

    public UserStory getUserStory() {
        return this.userStory;
    }

    public boolean isMain() {
        return this.isMain;
    }

    public boolean isMeetUser() {
        return this.isMeetUser;
    }

    public User getUser() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 84061, new Class[0], User.class)) {
            return this.userStory.getUser();
        }
        return (User) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 84061, new Class[0], User.class);
    }

    public int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 84063, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 84063, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.userStory != null) {
            i = this.userStory.hashCode();
        }
        return i;
    }

    public ProfileEntity setMain(boolean z) {
        this.isMain = z;
        return this;
    }

    public ProfileEntity setMeetUser(boolean z) {
        this.isMeetUser = z;
        return this;
    }

    public ProfileEntity setUserStory(UserStory userStory2) {
        this.userStory = userStory2;
        return this;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 84062, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 84062, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ProfileEntity profileEntity = (ProfileEntity) obj;
            if (this.userStory != null) {
                return this.userStory.equals(profileEntity.userStory);
            }
            if (profileEntity.userStory == null) {
                return true;
            }
            return false;
        }
    }
}
