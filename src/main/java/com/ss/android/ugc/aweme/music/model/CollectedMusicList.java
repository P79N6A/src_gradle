package com.ss.android.ugc.aweme.music.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public class CollectedMusicList extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cursor")
    public int cursor;
    @SerializedName("has_more")
    public int hasMore;
    @SerializedName("mc_list")
    public List<Music> items;

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z ? 1 : 0;
    }
}
