package com.ss.android.ugc.aweme.im.sdk.detail.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/detail/model/GroupPasswordInfo;", "Ljava/io/Serializable;", "()V", "expireTime", "", "getExpireTime", "()J", "setExpireTime", "(J)V", "groupPasswordDetailList", "", "Lcom/ss/android/ugc/aweme/im/sdk/detail/model/GroupPasswordDetail;", "getGroupPasswordDetailList", "()Ljava/util/List;", "setGroupPasswordDetailList", "(Ljava/util/List;)V", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("expire_time")
    private long expireTime;
    @SerializedName("share_data")
    @Nullable
    private List<b> groupPasswordDetailList;

    public final long getExpireTime() {
        return this.expireTime;
    }

    @Nullable
    public final List<b> getGroupPasswordDetailList() {
        return this.groupPasswordDetailList;
    }

    public final void setExpireTime(long j) {
        this.expireTime = j;
    }

    public final void setGroupPasswordDetailList(@Nullable List<b> list) {
        this.groupPasswordDetailList = list;
    }
}
