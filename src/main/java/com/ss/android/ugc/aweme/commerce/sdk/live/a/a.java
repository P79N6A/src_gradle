package com.ss.android.ugc.aweme.commerce.sdk.live.a;

import com.ss.android.ugc.aweme.commerce.service.l.d;
import com.ss.android.ugc.aweme.commerce.service.models.ak;
import com.ss.android.ugc.aweme.commerce.service.models.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/live/model/UILiveSkuInfo;", "", "goodsList", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/BaseDetailPromotion;", "authorId", "", "(Ljava/util/List;Ljava/lang/String;)V", "getAuthorId", "()Ljava/lang/String;", "setAuthorId", "(Ljava/lang/String;)V", "getGoodsList", "()Ljava/util/List;", "setGoodsList", "(Ljava/util/List;)V", "uiSkuInfoList", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/UISkuInfo;", "getUiSkuInfoList", "setUiSkuInfoList", "getUISkuInfoList", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class a {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public List<ak> f37739a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public List<? extends c> f37740b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public String f37741c;

    public a() {
        this(null, null, 3);
    }

    private a(@Nullable List<? extends c> list, @Nullable String str) {
        this.f37740b = list;
        this.f37741c = str;
        this.f37739a = new ArrayList();
        List<? extends c> list2 = this.f37740b;
        if (list2 != null) {
            for (c a2 : list2) {
                List<ak> list3 = this.f37739a;
                ak a3 = d.a(a2, this.f37741c);
                Intrinsics.checkExpressionValueIsNotNull(a3, "CommerceUtils.convertPro…ISkuInfo(goods, authorId)");
                list3.add(a3);
            }
        }
    }

    public /* synthetic */ a(List list, String str, int i) {
        this(CollectionsKt.emptyList(), null);
    }
}
