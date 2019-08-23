package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/model/RoomResponse;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "data", "Lcom/ss/android/ugc/aweme/follow/presenter/RoomStruct;", "(Lcom/ss/android/ugc/aweme/follow/presenter/RoomStruct;)V", "getData", "()Lcom/ss/android/ugc/aweme/follow/presenter/RoomStruct;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RoomResponse extends BaseResponse {
    @SerializedName("data")
    @Nullable
    public final RoomStruct data;

    public RoomResponse() {
        this(null, 1, null);
    }

    public RoomResponse(@Nullable RoomStruct roomStruct) {
        this.data = roomStruct;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomResponse(RoomStruct roomStruct, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : roomStruct);
    }
}
