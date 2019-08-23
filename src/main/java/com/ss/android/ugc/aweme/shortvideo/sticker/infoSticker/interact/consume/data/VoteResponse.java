package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.Metadata;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/VoteResponse;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "()V", "optionId", "", "getOptionId", "()I", "setOptionId", "(I)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VoteResponse extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("option_id")
    private int optionId = -1;

    public final int getOptionId() {
        return this.optionId;
    }

    public final void setOptionId(int i) {
        this.optionId = i;
    }
}
