package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;

public class SearchMusicList extends SearchApiResult {
    @SerializedName("cursor")
    public int cursor;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName(alternate = {"music_list"}, value = "music")
    public List<Music> musicList;
    @SerializedName("music_info_list")
    public List<SearchMusic> searchMusicList;
}
