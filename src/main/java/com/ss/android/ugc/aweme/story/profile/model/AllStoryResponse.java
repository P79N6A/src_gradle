package com.ss.android.ugc.aweme.story.profile.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import com.ss.android.ugc.aweme.story.api.model.e;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/story/profile/model/AllStoryResponse;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "Ljava/io/Serializable;", "()V", "cursor", "", "getCursor", "()J", "setCursor", "(J)V", "dailyStoryList", "", "Lcom/ss/android/ugc/aweme/story/api/model/DailyStory;", "getDailyStoryList", "()Ljava/util/List;", "setDailyStoryList", "(Ljava/util/List;)V", "hasMore", "", "getHasMore", "()I", "setHasMore", "(I)V", "logpb", "Lcom/ss/android/ugc/aweme/story/api/model/LogPbBean;", "getLogpb", "()Lcom/ss/android/ugc/aweme/story/api/model/LogPbBean;", "setLogpb", "(Lcom/ss/android/ugc/aweme/story/api/model/LogPbBean;)V", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AllStoryResponse extends BaseResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cursor")
    private long cursor;
    @SerializedName("daily_story_list")
    @Nullable
    private List<e> dailyStoryList;
    @SerializedName("has_more")
    private int hasMore;
    @SerializedName("log_pb")
    @Nullable
    private LogPbBean logpb;

    public final long getCursor() {
        return this.cursor;
    }

    @Nullable
    public final List<e> getDailyStoryList() {
        return this.dailyStoryList;
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    @Nullable
    public final LogPbBean getLogpb() {
        return this.logpb;
    }

    public final void setCursor(long j) {
        this.cursor = j;
    }

    public final void setDailyStoryList(@Nullable List<e> list) {
        this.dailyStoryList = list;
    }

    public final void setHasMore(int i) {
        this.hasMore = i;
    }

    public final void setLogpb(@Nullable LogPbBean logPbBean) {
        this.logpb = logPbBean;
    }
}
