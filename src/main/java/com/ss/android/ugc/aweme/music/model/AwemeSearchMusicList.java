package com.ss.android.ugc.aweme.music.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public class AwemeSearchMusicList {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cursor")
    public int cursor;
    @SerializedName("has_more")
    public int hasMore;
    @SerializedName("log_pb")
    public LogPbBean logPb;
    @SerializedName("music")
    public List<Music> musicList;

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
