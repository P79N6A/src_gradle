package com.ss.android.ugc.aweme.following.a;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/following/model/ConnectedRelationList;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "()V", "connectedRelationList", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "getConnectedRelationList", "()Ljava/util/List;", "setConnectedRelationList", "(Ljava/util/List;)V", "cursor", "", "getCursor", "()I", "setCursor", "(I)V", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "subTitle", "", "getSubTitle", "()Ljava/lang/String;", "setSubTitle", "(Ljava/lang/String;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends BaseResponse {
    @SerializedName("sub_title")
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public String f47869a = "";
    @SerializedName("connected_relation")
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public List<? extends User> f47870b;
}
