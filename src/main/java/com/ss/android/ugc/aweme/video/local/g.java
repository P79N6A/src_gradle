package com.ss.android.ugc.aweme.video.local;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;

public class g extends VideoUrlModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("author_id")
    String authorId;
    @SerializedName("local_path")
    public String localPath;

    public g() {
    }

    public String getLocalPath() {
        return this.localPath;
    }

    public g(String str) {
        setSourceId(str);
    }
}
