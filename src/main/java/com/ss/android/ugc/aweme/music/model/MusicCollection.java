package com.ss.android.ugc.aweme.music.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public class MusicCollection extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cursor")
    public long cursor;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("mc_list")
    public List<MusicCollectionItem> items;

    public List<MusicCollectionItem> getItems() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 60009, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 60009, new Class[0], List.class);
        } else if (this.items == null || this.items.isEmpty()) {
            return this.items;
        } else {
            return MusicCollectionFilterKt.distinctByName(this.items);
        }
    }
}
