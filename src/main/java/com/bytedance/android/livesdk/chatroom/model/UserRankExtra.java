package com.bytedance.android.livesdk.chatroom.model;

import android.support.annotation.Keep;
import com.bytedance.android.live.base.model.Extra;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class UserRankExtra extends Extra {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("gap_score")
    private int gapScore;
    @SerializedName("history_rank")
    private int historyRank;
    @SerializedName("notice_text")
    private String noticeText;
    @SerializedName("self_rank")
    private String selfRank;
    @SerializedName("self_score")
    private long selfScore;
    @SerializedName("top_fans")
    private boolean topFans;

    public int getGapScore() {
        return this.gapScore;
    }

    public int getHistoryRank() {
        return this.historyRank;
    }

    public String getNoticeText() {
        return this.noticeText;
    }

    public long getNow() {
        return this.now;
    }

    public long getSelfScore() {
        return this.selfScore;
    }

    public int getTotal() {
        return this.total;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public boolean isTopFans() {
        return this.topFans;
    }

    public String getSelfRank() {
        if (this.selfRank == null) {
            return "";
        }
        return this.selfRank;
    }

    public void setGapScore(int i) {
        this.gapScore = i;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setHistoryRank(int i) {
        this.historyRank = i;
    }

    public void setNoticeText(String str) {
        this.noticeText = str;
    }

    public void setNow(long j) {
        this.now = j;
    }

    public void setSelfRank(String str) {
        this.selfRank = str;
    }

    public void setSelfScore(long j) {
        this.selfScore = j;
    }

    public void setTopFans(boolean z) {
        this.topFans = z;
    }

    public void setTotal(int i) {
        this.total = i;
    }
}
