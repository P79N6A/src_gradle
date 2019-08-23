package com.ss.android.ugc.aweme.music.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import java.util.List;

public class MusicDetail extends BaseResponse {
    @SerializedName("billboard_type")
    public int billboardType;
    @SerializedName("edition_uid")
    public int editionUid;
    @SerializedName("music_info")
    public Music music;
    @SerializedName("rec_list")
    public List<RelatedChallengeMusic> relatedChallengeMusicList;
    @SerializedName("top_bodydance_avatars")
    public List<UrlModel> topBodydanceAvatars;
}
