package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/VoteDetailResponse;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "()V", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "offset", "", "getOffset", "()I", "setOffset", "(I)V", "users", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "getUsers", "()Ljava/util/List;", "setUsers", "(Ljava/util/List;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VoteDetailResponse extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("has_more")
    private boolean hasMore;
    @SerializedName("offset")
    private int offset;
    @SerializedName("user_list")
    @Nullable
    private List<? extends User> users;

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getOffset() {
        return this.offset;
    }

    @Nullable
    public final List<User> getUsers() {
        return this.users;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setOffset(int i) {
        this.offset = i;
    }

    public final void setUsers(@Nullable List<? extends User> list) {
        this.users = list;
    }
}
