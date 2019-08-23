package com.ss.android.ugc.aweme.story.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

@Keep
public class StoryResponse extends BaseResponse implements h {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("enable_auto_open_window")
    public int autoOpenWindow = 1;
    @SerializedName("commerce_story_feed")
    a commerceStoryFeed;
    @SerializedName("cursor")
    long cursor;
    @SerializedName("has_more")
    boolean hasMore;
    @SerializedName("latest_time")
    int latestTime;
    @SerializedName("request_id")
    String requestId;
    @SerializedName("story_feed")
    List<Story> storyFeed;
    @SerializedName("type")
    int type;

    public static class a {
        @SerializedName("entry_icon")

        /* renamed from: a  reason: collision with root package name */
        public UrlModel f73226a;
        @SerializedName("entry_text")

        /* renamed from: b  reason: collision with root package name */
        public String f73227b;
        @SerializedName("entry_open_url")

        /* renamed from: c  reason: collision with root package name */
        public String f73228c;
        @SerializedName("entry_web_url")

        /* renamed from: d  reason: collision with root package name */
        public String f73229d;
        @SerializedName("entry_web_title")

        /* renamed from: e  reason: collision with root package name */
        public String f73230e;
        @SerializedName("auto_open_window")

        /* renamed from: f  reason: collision with root package name */
        public boolean f73231f;
        @SerializedName("bubble_color")
        public String g;
        @SerializedName("bubble_text")
        public String h;
    }

    public a getCommerceStoryFeed() {
        return this.commerceStoryFeed;
    }

    public long getCursor() {
        return this.cursor;
    }

    public int getLatestTime() {
        return this.latestTime;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int getStatusCode() {
        return this.status_code;
    }

    public List<Story> getStoryFeed() {
        return this.storyFeed;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setCursor(long j) {
        this.cursor = j;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setLatestTime(int i) {
        this.latestTime = i;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setStatusCode(int i) {
        this.status_code = i;
    }

    public void setStoryFeed(List<Story> list) {
        this.storyFeed = list;
    }
}
