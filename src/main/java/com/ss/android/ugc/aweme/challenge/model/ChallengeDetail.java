package com.ss.android.ugc.aweme.challenge.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

public class ChallengeDetail extends BaseResponse {
    @SerializedName("ch_info")
    public Challenge challenge;
    @SerializedName("rec_list")
    public List<RelatedChallengeMusic> relatedChallengeMusicList;
    @SerializedName("slide_list")
    public List<Aweme> slideList;
    @SerializedName("slide_title")
    public String slideTitle;
}
