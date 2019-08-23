package com.ss.android.ugc.aweme.im.sdk.feedupdate;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;

@Keep
public class FeedUpdateInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("last_aweme_info")

    /* renamed from: a  reason: collision with root package name */
    Object f51458a;
    @SerializedName("aweme_id")
    String aid;
    @SerializedName("author")
    User author;
    @SerializedName("create_time")
    long timeStamp;
    @SerializedName("desc")
    String title;
    @SerializedName("video")
    a videoTemp;

    class a {
        @SerializedName("cover")

        /* renamed from: a  reason: collision with root package name */
        public UrlModel f51459a;
    }

    public String getAid() {
        return this.aid;
    }

    public User getAuthor() {
        return this.author;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public String getTitle() {
        return this.title;
    }

    public a getVideoTemp() {
        return this.videoTemp;
    }

    public UrlModel getCoverUrl() {
        if (this.videoTemp == null) {
            return null;
        }
        return this.videoTemp.f51459a;
    }

    public String getUid() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52061, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52061, new Class[0], String.class);
        } else if (this.author == null) {
            return null;
        } else {
            return this.author.getUid();
        }
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setVideoTemp(a aVar) {
        this.videoTemp = aVar;
    }
}
