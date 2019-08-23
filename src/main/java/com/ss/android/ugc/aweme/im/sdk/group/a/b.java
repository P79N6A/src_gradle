package com.ss.android.ugc.aweme.im.sdk.group.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/model/GroupCheckMsg;", "Ljava/io/Serializable;", "()V", "invalidMembers", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "getInvalidMembers", "()Ljava/util/List;", "setInvalidMembers", "(Ljava/util/List;)V", "statusCode", "", "getStatusCode", "()Ljava/lang/Integer;", "setStatusCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "statusMsg", "", "getStatusMsg", "()Ljava/lang/String;", "setStatusMsg", "(Ljava/lang/String;)V", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("invalid_members")
    @Nullable
    private List<? extends IMUser> invalidMembers;
    @SerializedName("status_code")
    @Nullable
    private Integer statusCode;
    @SerializedName("status_msg")
    @Nullable
    private String statusMsg;

    @Nullable
    public final List<IMUser> getInvalidMembers() {
        return this.invalidMembers;
    }

    @Nullable
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    @Nullable
    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final void setInvalidMembers(@Nullable List<? extends IMUser> list) {
        this.invalidMembers = list;
    }

    public final void setStatusCode(@Nullable Integer num) {
        this.statusCode = num;
    }

    public final void setStatusMsg(@Nullable String str) {
        this.statusMsg = str;
    }
}
