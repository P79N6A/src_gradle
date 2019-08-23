package com.ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.NewFaceSticker;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public class SearchUser {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("items")
    public List<Aweme> awemeCards;
    @SerializedName("effects")
    public List<NewFaceSticker> effectCards;
    @SerializedName("musics")
    public List<Music> musicCards;
    @SerializedName("position")
    public List<Position> position;
    @SerializedName("remark_position")
    public List<Position> remarkPosition;
    @SerializedName("uniqid_position")
    public List<Position> uniqidPosition;
    @SerializedName("user_info")
    public User user;

    public int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37126, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37126, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.user.getUid() != null) {
            i = this.user.getUid().hashCode();
        }
        return i;
    }

    public boolean isAladdin() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37127, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37127, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (cardType() != 0) {
            z = true;
        }
        return z;
    }

    public int cardType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37128, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37128, new Class[0], Integer.TYPE)).intValue();
        } else if (!CollectionUtils.isEmpty(this.awemeCards)) {
            return 1;
        } else {
            if (!CollectionUtils.isEmpty(this.musicCards)) {
                return 2;
            }
            if (!CollectionUtils.isEmpty(this.effectCards)) {
                return 3;
            }
            return 0;
        }
    }

    public SearchUser setUser(User user2) {
        this.user = user2;
        return this;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37125, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37125, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof SearchUser)) {
                return false;
            }
            return TextUtils.equals(this.user.getUid(), ((SearchUser) obj).user.getUid());
        }
    }
}
