package com.ss.android.ugc.aweme.sign;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;

@Keep
public class RecordResponseInfo extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cover")
    UrlModel cover;
    @SerializedName("video")
    UrlModel video;
    private String videoId;

    public UrlModel getCover() {
        return this.cover;
    }

    public UrlModel getVideo() {
        return this.video;
    }

    public String getVideoId() {
        return this.videoId;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setVideo(UrlModel urlModel) {
        this.video = urlModel;
    }

    public void setVideoId(String str) {
        this.videoId = str;
    }
}
