package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

public class HotSearchSprintStruct implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1;
    @SerializedName("followers")
    public List<User> hitRankPeoples;
    @SerializedName("sprint")
    public int sprint;

    public List<User> getHitRankPeoples() {
        return this.hitRankPeoples;
    }

    public int getSprint() {
        return this.sprint;
    }

    public void setHitRankPeoples(List<User> list) {
        this.hitRankPeoples = list;
    }

    public void setSprint(int i) {
        this.sprint = i;
    }
}
