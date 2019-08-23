package com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b;

import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/input/gifsearch/model/GifRes;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/input/gifsearch/model/BaseGifRes;", "()V", "height", "", "getHeight", "()Ljava/lang/String;", "setHeight", "(Ljava/lang/String;)V", "url", "getUrl", "setUrl", "width", "getWidth", "setWidth", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends a {
    @SerializedName("url")
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public String f50596a;
    @SerializedName("width")
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public String f50597b = PushConstants.PUSH_TYPE_NOTIFY;
    @SerializedName("height")
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public String f50598c = PushConstants.PUSH_TYPE_NOTIFY;
}
