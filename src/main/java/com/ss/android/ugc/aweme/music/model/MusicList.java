package com.ss.android.ugc.aweme.music.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public class MusicList extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cursor")
    public int cursor;
    @SerializedName("has_more")
    public int hasMore;
    @SerializedName("music_list")
    public List<Music> items;
    @SerializedName("log_pb")
    public LogPbBean logPb;
    @SerializedName("music_type")
    public int mMusicType;
    @SerializedName("mc_info")
    public MusicCollectionItem mcInfo;
    @SerializedName("radio_cursor")
    public int radioCursor;

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public int getCursor() {
        if (this.radioCursor > 0) {
            return this.radioCursor;
        }
        return this.cursor;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z ? 1 : 0;
    }
}
