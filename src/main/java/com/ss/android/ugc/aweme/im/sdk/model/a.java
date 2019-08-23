package com.ss.android.ugc.aweme.im.sdk.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/model/GreetEmojiList;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "Ljava/io/Serializable;", "()V", "emojiList", "", "Lcom/ss/android/ugc/aweme/im/sdk/resources/model/Emoji;", "getEmojiList", "()Ljava/util/List;", "setEmojiList", "(Ljava/util/List;)V", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends BaseResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("stickers")
    @Nullable
    private List<? extends com.ss.android.ugc.aweme.im.sdk.resources.model.a> emojiList;

    @Nullable
    public final List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> getEmojiList() {
        return this.emojiList;
    }

    public final void setEmojiList(@Nullable List<? extends com.ss.android.ugc.aweme.im.sdk.resources.model.a> list) {
        this.emojiList = list;
    }
}
