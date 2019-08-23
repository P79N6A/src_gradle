package com.bytedance.android.live.base.model;

import android.support.annotation.Keep;
import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.bytedance.android.live.base.model.b.b;
import com.bytedance.android.live.base.model.b.c;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

@Keep
public class Extra {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("banner")
    public b bannerContainer;
    @SerializedName("cost")
    public long cost;
    @SerializedName("screen_delay")
    public long danmakuDelay;
    @SerializedName("diamond_count")
    @IgnoreStyleCheck
    public long diamondCount;
    @SerializedName("fatal_ids")
    public List<Long> fatalIds;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("banner_image")
    public ImageModel imageModel;
    @SerializedName("last_refresh_time")
    public long lastRefreshTime;
    @SerializedName("live_feed_schema")
    @IgnoreStyleCheck
    public String liveFeedSchema;
    @SerializedName("log_pb")
    public JsonObject logPb;
    @SerializedName("max_cursor")
    @IgnoreStyleCheck
    public int maxCursor;
    @SerializedName("max_time")
    public long maxTime;
    @SerializedName("min_rank")
    public long minRank;
    @SerializedName("min_time")
    public long minTime;
    @SerializedName("now")
    public long now;
    @SerializedName("offset")
    public int offset;
    private boolean prefetchFlag;
    @SerializedName("rank_round_banner")
    public c rankRoundBanner;
    @SerializedName("recommend_user_offset")
    public int recommendUserOffset;
    @SerializedName("recommend_users")
    public List<Object> recommendUsersList;
    @SerializedName("req_id")
    public String reqId;
    @SerializedName("room_limit")
    public int roomLimit;
    @SerializedName("search_id")
    public String searchId;
    @SerializedName("show_anchor_remind")
    private int showAnchorRemind;
    @SerializedName("show_social_recommend")
    public boolean showSocialRecommend;
    @SerializedName("tips")
    public String tips;
    @SerializedName("total")
    public int total;
    @SerializedName("unread_extra")
    public String unreadExtra;

    public int getOffset() {
        return this.offset;
    }

    public int getShowAnchorRemind() {
        return this.showAnchorRemind;
    }

    public boolean isPrefetchFlag() {
        return this.prefetchFlag;
    }

    public void setPrefetchFlag(boolean z) {
        this.prefetchFlag = z;
    }
}
