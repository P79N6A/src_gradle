package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/bytedance/android/livesdk/gift/model/GiftAd;", "", "()V", "count", "", "getCount", "()I", "setCount", "(I)V", "description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "icon", "Lcom/bytedance/android/live/base/model/ImageModel;", "getIcon", "()Lcom/bytedance/android/live/base/model/ImageModel;", "setIcon", "(Lcom/bytedance/android/live/base/model/ImageModel;)V", "index", "getIndex", "setIndex", "title", "getTitle", "setTitle", "liveutility_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class c {
    @SerializedName("icon")
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public ImageModel f15108a;
    @SerializedName("count")

    /* renamed from: b  reason: collision with root package name */
    public int f15109b;
    @SerializedName("title")
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public String f15110c = "";
    @SerializedName("description")
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public String f15111d = "";
}
