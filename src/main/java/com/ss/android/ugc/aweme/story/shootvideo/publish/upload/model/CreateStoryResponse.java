package com.ss.android.ugc.aweme.story.shootvideo.publish.upload.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.shortvideo.at;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;

@Keep
public final class CreateStoryResponse extends at {
    @SerializedName("aweme")
    public LifeStory story;
}
