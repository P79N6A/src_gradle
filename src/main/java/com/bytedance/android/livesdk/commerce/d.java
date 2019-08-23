package com.bytedance.android.livesdk.commerce;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001e\u0010\u001b\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001e\u0010\u001e\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001e\u0010!\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000e¨\u0006$"}, d2 = {"Lcom/bytedance/android/livesdk/commerce/LiveGoods;", "", "()V", "cover", "Lcom/bytedance/android/live/base/model/ImageModel;", "getCover", "()Lcom/bytedance/android/live/base/model/ImageModel;", "setCover", "(Lcom/bytedance/android/live/base/model/ImageModel;)V", "detailUrl", "", "getDetailUrl", "()Ljava/lang/String;", "setDetailUrl", "(Ljava/lang/String;)V", "mark", "getMark", "setMark", "price", "", "getPrice", "()I", "setPrice", "(I)V", "productId", "getProductId", "setProductId", "promotionId", "getPromotionId", "setPromotionId", "sales", "getSales", "setSales", "title", "getTitle", "setTitle", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public class d {
    @SerializedName("product_id")
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public String f13621a = "";
    @SerializedName("promotion_id")
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public String f13622b = "";
    @SerializedName("cover")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public ImageModel f13623c;
    @SerializedName("price")

    /* renamed from: d  reason: collision with root package name */
    public int f13624d;
    @SerializedName("title")
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public String f13625e = "";
    @SerializedName("sales")

    /* renamed from: f  reason: collision with root package name */
    public int f13626f;
    @SerializedName("detail_url")
    @NotNull
    public String g = "";
    @SerializedName("mark")
    @NotNull
    public String h = "";
}
