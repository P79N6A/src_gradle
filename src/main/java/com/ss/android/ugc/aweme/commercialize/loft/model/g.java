package com.ss.android.ugc.aweme.commercialize.loft.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R&\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftResponse;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "Ljava/io/Serializable;", "()V", "animationRes", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftAnimationRes;", "getAnimationRes", "()Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftAnimationRes;", "setAnimationRes", "(Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftAnimationRes;)V", "endTime", "", "getEndTime", "()Ljava/lang/Integer;", "setEndTime", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "guide", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftGuide;", "getGuide", "()Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftGuide;", "setGuide", "(Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftGuide;)V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "status", "getStatus", "()I", "setStatus", "(I)V", "videoList", "", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftVideo;", "getVideoList", "()Ljava/util/List;", "setVideoList", "(Ljava/util/List;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g extends BaseResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("brand_package")
    @Nullable
    private b animationRes;
    @SerializedName("activity_end_time")
    @Nullable
    private Integer endTime = 0;
    @SerializedName("second_floor_guide")
    @Nullable
    private d guide;
    @SerializedName("activity_id")
    @Nullable
    private String id;
    @SerializedName("status")
    private int status = 0;
    @SerializedName("aweme_list")
    @Nullable
    private List<j> videoList;

    @Nullable
    public final b getAnimationRes() {
        return this.animationRes;
    }

    @Nullable
    public final Integer getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final d getGuide() {
        return this.guide;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final List<j> getVideoList() {
        return this.videoList;
    }

    public final void setAnimationRes(@Nullable b bVar) {
        this.animationRes = bVar;
    }

    public final void setEndTime(@Nullable Integer num) {
        this.endTime = num;
    }

    public final void setGuide(@Nullable d dVar) {
        this.guide = dVar;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setVideoList(@Nullable List<j> list) {
        this.videoList = list;
    }
}
