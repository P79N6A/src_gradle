package com.ss.android.ugc.aweme.challenge.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.model.Music;

public class RelatedChallengeMusic {
    @SerializedName("category_type")
    public int categoryType;
    @SerializedName("ch_info")
    public Challenge challenge;
    @SerializedName("music_info")
    public Music music;
}
