package com.ss.android.ugc.aweme.music.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

public class RecommendMusicList {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cursor")
    public long cursor;
    @SerializedName("has_more")
    public int hasMore;
    @SerializedName("music_list")
    public List<RecommendMusic> musicList;

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
