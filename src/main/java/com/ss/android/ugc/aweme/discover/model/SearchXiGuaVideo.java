package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/SearchXiGuaVideo;", "Ljava/io/Serializable;", "()V", "position", "", "Lcom/ss/android/ugc/aweme/discover/model/Position;", "getPosition", "()Ljava/util/List;", "setPosition", "(Ljava/util/List;)V", "video", "Lcom/ss/android/ugc/aweme/discover/model/XiGuaVideo;", "getVideo", "()Lcom/ss/android/ugc/aweme/discover/model/XiGuaVideo;", "setVideo", "(Lcom/ss/android/ugc/aweme/discover/model/XiGuaVideo;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchXiGuaVideo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("position")
    @Nullable
    private List<? extends Position> position;
    @SerializedName("video_info")
    @Nullable
    private XiGuaVideo video;

    @Nullable
    public final List<Position> getPosition() {
        return this.position;
    }

    @Nullable
    public final XiGuaVideo getVideo() {
        return this.video;
    }

    public final void setPosition(@Nullable List<? extends Position> list) {
        this.position = list;
    }

    public final void setVideo(@Nullable XiGuaVideo xiGuaVideo) {
        this.video = xiGuaVideo;
    }
}
