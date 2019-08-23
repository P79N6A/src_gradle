package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class AwemeRiskModel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("content")
    public String content;
    @SerializedName("risk_sink")
    public boolean riskSink;
    @SerializedName("type")
    public int type;
    @SerializedName("vote")
    public boolean vote;
    public int voteStatus = -1;
    @SerializedName("warn")
    public boolean warn;

    public String getContent() {
        return this.content;
    }

    public int getType() {
        return this.type;
    }

    public int getVoteStatus() {
        return this.voteStatus;
    }

    public boolean isRiskSink() {
        return this.riskSink;
    }

    public boolean isVote() {
        return this.vote;
    }

    public boolean isWarn() {
        return this.warn;
    }

    public void setRiskSink(boolean z) {
        this.riskSink = z;
    }

    public void setVote(boolean z) {
        this.vote = z;
    }

    public void setVoteStatus(int i) {
        this.voteStatus = i;
    }

    public void setWarn(boolean z) {
        this.warn = z;
    }
}
