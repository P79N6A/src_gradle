package com.ss.android.ugc.aweme.im.sdk.detail.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/detail/model/GroupShareInfo;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "Ljava/io/Serializable;", "()V", "groupPasswordInfo", "Lcom/ss/android/ugc/aweme/im/sdk/detail/model/GroupPasswordInfo;", "getGroupPasswordInfo", "()Lcom/ss/android/ugc/aweme/im/sdk/detail/model/GroupPasswordInfo;", "setGroupPasswordInfo", "(Lcom/ss/android/ugc/aweme/im/sdk/detail/model/GroupPasswordInfo;)V", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d extends BaseResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("data")
    @Nullable
    private c groupPasswordInfo;

    @Nullable
    public final c getGroupPasswordInfo() {
        return this.groupPasswordInfo;
    }

    public final void setGroupPasswordInfo(@Nullable c cVar) {
        this.groupPasswordInfo = cVar;
    }
}