package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class HotSearchInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    static final long serialVersionUID = 4;
    @SerializedName("challenge_id")
    public String challengeId;
    @SerializedName("search_word")
    public String searchWord;
    @SerializedName("sentence")
    public String sentence;
    @SerializedName("value")
    public long value;
    @SerializedName("vb_rank")
    public int videoRank;
    @SerializedName("vb_rank_value")
    public long videoRankVV;

    public String getChallengeId() {
        return this.challengeId;
    }

    public String getSearchWord() {
        return this.searchWord;
    }

    public String getSentence() {
        return this.sentence;
    }

    public long getValue() {
        return this.value;
    }

    public int getVideoRank() {
        return this.videoRank;
    }

    public long getVideoRankVV() {
        return this.videoRankVV;
    }

    public void setChallengeId(String str) {
        this.challengeId = str;
    }

    public void setSearchWord(String str) {
        this.searchWord = str;
    }

    public void setSentence(String str) {
        this.sentence = str;
    }

    public void setValue(long j) {
        this.value = j;
    }

    public void setVideoRank(int i) {
        this.videoRank = i;
    }

    public void setVideoRankVV(long j) {
        this.videoRankVV = j;
    }
}
