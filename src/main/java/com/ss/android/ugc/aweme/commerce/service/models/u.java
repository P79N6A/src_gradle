package com.ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.commerce.service.d.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\tR\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/ShopPromotionListResponse;", "Lcom/ss/android/ugc/aweme/commerce/service/dto/CommerceBaseResponse;", "()V", "columns", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopColumn;", "getColumns", "()Ljava/util/List;", "setColumns", "(Ljava/util/List;)V", "count", "", "getCount", "()I", "setCount", "(I)V", "goodsList", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/SimpleDetailPromotion;", "getGoodsList", "setGoodsList", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "searchHint", "", "getSearchHint", "()Ljava/lang/String;", "setSearchHint", "(Ljava/lang/String;)V", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class u extends a {
    @SerializedName("promotions")
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public List<w> f38229a = new ArrayList();
    @SerializedName("columns")
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public List<t> f38230b = CollectionsKt.emptyList();
    @SerializedName("count")

    /* renamed from: c  reason: collision with root package name */
    public int f38231c;
    @SerializedName("has_more")

    /* renamed from: d  reason: collision with root package name */
    public boolean f38232d;
    @SerializedName("search_hint")
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public String f38233e = "";
}
