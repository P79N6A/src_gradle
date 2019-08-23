package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class StoryBlockInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("life_story_block")
    public boolean isBlock;
    @SerializedName("life_story_blocked")
    public boolean isBlocked;

    public boolean isBlock() {
        return this.isBlock;
    }

    public boolean isBlocked() {
        return this.isBlocked;
    }

    public void setBlock(boolean z) {
        this.isBlock = z;
    }

    public void setBlocked(boolean z) {
        this.isBlocked = z;
    }
}
