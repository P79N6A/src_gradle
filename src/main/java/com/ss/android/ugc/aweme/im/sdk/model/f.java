package com.ss.android.ugc.aweme.im.sdk.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/model/UserInfo;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "()V", "data", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "nextPageLimit", "", "getNextPageLimit", "()I", "setNextPageLimit", "(I)V", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f extends BaseResponse {
    @SerializedName("data")
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public List<? extends IMUser> f51828a;
    @SerializedName("nextPageLimit")

    /* renamed from: b  reason: collision with root package name */
    public int f51829b;
}
