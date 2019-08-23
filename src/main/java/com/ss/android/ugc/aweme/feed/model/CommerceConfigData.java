package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class CommerceConfigData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("item_like_egg")
    public ItemLikeEggData itemLikeEggData;
    @SerializedName("type")
    public int type;

    public ItemLikeEggData getItemLikeEggData() {
        return this.itemLikeEggData;
    }

    public int getType() {
        return this.type;
    }

    public void setItemLikeEggData(ItemLikeEggData itemLikeEggData2) {
        this.itemLikeEggData = itemLikeEggData2;
    }

    public void setType(int i) {
        this.type = i;
    }
}
