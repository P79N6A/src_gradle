package com.ss.android.ugc.aweme.follow.presenter;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.follow.c;
import java.util.ArrayList;
import java.util.List;

@Keep
public class FollowFeedList extends BaseResponse implements h, Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("snapshot_control")
    private int cacheControl;
    long cursor;
    @SerializedName("err_msg")
    private String errMsg;
    @SerializedName("feed_type")
    private int feedType;
    @SerializedName("fetch_recommend")
    private int fetchRecommend;
    @SerializedName("has_more")
    private int hasMore;
    @SerializedName("is_recommend")
    int isRecommend;
    @SerializedName("last_view")
    c lastViewData;
    int level;
    @SerializedName("log_pb")
    private LogPbBean logPb;
    @SerializedName("data")
    private List<FollowFeed> mItems;
    @SerializedName("max_cursor")
    long maxCursor;
    @SerializedName("min_cursor")
    long minCursor;
    @SerializedName("need_change_snapshot")
    private int needCache;
    @SerializedName("need_delete_snapshot")
    private int needDeleteCache;
    @SerializedName("new_item_count")
    private int newItemCount;
    @SerializedName("new_room_count")
    private int newLiveCount;
    @SerializedName("rid")
    String requestId;
    @SerializedName("up_phone_notice")
    int upPhoneNotice;

    public long getCursor() {
        return this.cursor;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public int getFeedType() {
        return this.feedType;
    }

    public int getFetchRecommend() {
        return this.fetchRecommend;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public int getIsRecommend() {
        return this.isRecommend;
    }

    public List<FollowFeed> getItems() {
        return this.mItems;
    }

    public c getLastViewData() {
        return this.lastViewData;
    }

    public int getLevel() {
        return this.level;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    public int getNewItemCount() {
        return this.newItemCount;
    }

    public int getNewLiveCount() {
        return this.newLiveCount;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int getUpPhoneNotice() {
        return this.upPhoneNotice;
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public boolean needCache() {
        if (this.needCache == 1) {
            return true;
        }
        return false;
    }

    public boolean needDeleteCache() {
        if (this.needDeleteCache == 1) {
            return true;
        }
        return false;
    }

    public boolean needUseCache() {
        if (this.cacheControl == 1) {
            return true;
        }
        return false;
    }

    public FollowFeedList clone() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44640, new Class[0], FollowFeedList.class)) {
            return (FollowFeedList) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44640, new Class[0], FollowFeedList.class);
        }
        try {
            FollowFeedList followFeedList = (FollowFeedList) super.clone();
            followFeedList.errMsg = this.errMsg;
            followFeedList.hasMore = this.hasMore;
            followFeedList.minCursor = this.minCursor;
            followFeedList.maxCursor = this.maxCursor;
            followFeedList.requestId = this.requestId;
            followFeedList.mItems = (ArrayList) ((ArrayList) this.mItems).clone();
            followFeedList.fetchRecommend = this.fetchRecommend;
            followFeedList.logPb = this.logPb;
            followFeedList.cursor = this.cursor;
            followFeedList.level = this.level;
            followFeedList.lastViewData = this.lastViewData;
            followFeedList.newItemCount = this.newItemCount;
            followFeedList.newLiveCount = this.newLiveCount;
            followFeedList.feedType = this.feedType;
            return followFeedList;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public void setCursor(long j) {
        this.cursor = j;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }

    public void setFeedType(int i) {
        this.feedType = i;
    }

    public void setFetchRecommend(int i) {
        this.fetchRecommend = i;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setIsRecommend(int i) {
        this.isRecommend = i;
    }

    public void setItems(List<FollowFeed> list) {
        this.mItems = list;
    }

    public void setLastViewData(c cVar) {
        this.lastViewData = cVar;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public void setMinCursor(long j) {
        this.minCursor = j;
    }

    public void setNewItemCount(int i) {
        this.newItemCount = i;
    }

    public void setNewLiveCount(int i) {
        this.newLiveCount = i;
    }

    public void setUpPhoneNotice(int i) {
        this.upPhoneNotice = i;
    }

    public void setRequestId(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 44641, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 44641, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.requestId = str;
        for (FollowFeed requestId2 : this.mItems) {
            requestId2.setRequestId(str);
        }
    }
}
