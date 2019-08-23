package com.bytedance.android.livesdk.chatroom.dutygift;

import android.support.annotation.Keep;
import com.bytedance.android.live.base.model.user.User;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class DutyGiftInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("duty_id")
    public long mDutyId;
    @SerializedName("speedy_gift_id")
    private long mGiftId;
    @SerializedName("contribute_most")
    private User mMvpUser;
    @SerializedName("score")
    private long mScore;
    @SerializedName("stage_count")
    private long mStageCount;
    @SerializedName("status")
    private int mStatus;
    private int mSuccess;
    @SerializedName("target_score")
    private long mTargetScore;

    public long getDutyId() {
        return this.mDutyId;
    }

    public long getGiftId() {
        return this.mGiftId;
    }

    public User getMvpUser() {
        return this.mMvpUser;
    }

    public long getScore() {
        return this.mScore;
    }

    public long getStageCount() {
        return this.mStageCount;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public long getTargetScore() {
        return this.mTargetScore;
    }

    public int isSuccess() {
        return this.mSuccess;
    }

    public boolean isFinished() {
        if (this.mStatus == 4) {
            return true;
        }
        return false;
    }

    public boolean isPlaying() {
        if (this.mStatus == 3) {
            return true;
        }
        return false;
    }

    public boolean isStarted() {
        if (this.mStatus == 2) {
            return true;
        }
        return false;
    }

    public void setDutyId(long j) {
        this.mDutyId = j;
    }

    public void setGiftId(long j) {
        this.mGiftId = j;
    }

    public void setMvpUser(User user) {
        this.mMvpUser = user;
    }

    public void setScore(long j) {
        this.mScore = j;
    }

    public void setStageCount(long j) {
        this.mStageCount = j;
    }

    public void setStatus(int i) {
        this.mStatus = i;
    }

    public void setSuccess(int i) {
        this.mSuccess = i;
    }

    public void setTargetScore(long j) {
        this.mTargetScore = j;
    }
}
