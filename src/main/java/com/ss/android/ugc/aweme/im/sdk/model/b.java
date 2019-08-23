package com.ss.android.ugc.aweme.im.sdk.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0007\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/model/MixInitResponse;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "()V", "imToken", "", "getImToken", "()Ljava/lang/String;", "isActiveX", "", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "rCellStatus", "Lcom/ss/android/ugc/aweme/im/sdk/model/RMsgCellStatus;", "getRCellStatus", "()Lcom/ss/android/ugc/aweme/im/sdk/model/RMsgCellStatus;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends BaseResponse {
    @SerializedName("r_cell_status")
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final c f51821a;
    @SerializedName("is_active_x")
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f51822b;
    @SerializedName("im_token")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final String f51823c;
}
