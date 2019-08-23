package com.bytedance.android.live.base.model;

import android.support.annotation.Keep;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;

@Keep
public class FansClubMember {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("badge")
    private a badge;
    @SerializedName("cur_level_intimacy")
    private int curLevelIntimacy;
    @SerializedName("data")
    private FansClubData data;
    @SerializedName("intimacy")
    private int intimacy;
    @SerializedName("level")
    private int level;
    @SerializedName("next_level_intimacy")
    private int nextLevelIntimacy;
    @SerializedName("prefer_data")
    private Map<Integer, FansClubData> preferData;
    @SerializedName("status")
    private int status;

    public a getBadge() {
        return this.badge;
    }

    public int getCurLevelIntimacy() {
        return this.curLevelIntimacy;
    }

    public FansClubData getData() {
        return this.data;
    }

    public int getIntimacy() {
        return this.intimacy;
    }

    public int getLevel() {
        return this.level;
    }

    public int getNextLevelIntimacy() {
        return this.nextLevelIntimacy;
    }

    public Map<Integer, FansClubData> getPreferData() {
        return this.preferData;
    }

    public int getStatus() {
        return this.status;
    }

    public void setBadge(a aVar) {
        this.badge = aVar;
    }

    public void setCurLevelIntimacy(int i) {
        this.curLevelIntimacy = i;
    }

    public void setData(FansClubData fansClubData) {
        this.data = fansClubData;
    }

    public void setIntimacy(int i) {
        this.intimacy = i;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setNextLevelIntimacy(int i) {
        this.nextLevelIntimacy = i;
    }

    public void setPreferData(Map<Integer, FansClubData> map) {
        this.preferData = map;
    }

    public void setStatus(int i) {
        this.status = i;
    }
}
