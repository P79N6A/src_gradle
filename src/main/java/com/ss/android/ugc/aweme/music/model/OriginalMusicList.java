package com.ss.android.ugc.aweme.music.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public class OriginalMusicList extends BaseResponse {
    @SerializedName("cursor")
    public int cursor;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("music")
    public List<Music> musicList;
}
