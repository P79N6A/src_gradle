package com.ss.android.ugc.aweme.shortvideo.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;

public class MusicList {
    @SerializedName("music_list")
    public List<Music> musicList;
}
