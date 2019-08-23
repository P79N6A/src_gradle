package com.bytedance.android.livesdk.chatroom.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

@Keep
public class WaitingReviewInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("audit_content")
    private String content;
    @SerializedName("audit_status")
    private int status;
    @SerializedName("total_queue_cnt")
    private int totalWaitingCount;
    @SerializedName("cur_wait_cnt")
    private int waitingCount;
    @SerializedName("rule_info")
    private List<aj> waitingReviewRules;
    @SerializedName("to_wait_time")
    private int waitingTime;

    public String getContent() {
        return this.content;
    }

    public int getStatus() {
        return this.status;
    }

    public int getTotalWaitingCount() {
        return this.totalWaitingCount;
    }

    public int getWaitingCount() {
        return this.waitingCount;
    }

    public List<aj> getWaitingReviewRules() {
        return this.waitingReviewRules;
    }

    public int getWaitingTime() {
        return this.waitingTime;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTotalWaitingCount(int i) {
        this.totalWaitingCount = i;
    }

    public void setWaitingCount(int i) {
        this.waitingCount = i;
    }

    public void setWaitingReviewRules(List<aj> list) {
        this.waitingReviewRules = list;
    }

    public void setWaitingTime(int i) {
        this.waitingTime = i;
    }
}
