package com.ss.android.ugc.aweme.commerce.service.k;

import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032,\u0010\u0004\u001a(\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH&J&\u0010\u000f\u001a\u00020\u00032\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011H&J\b\u0010\u0012\u001a\u00020\u0006H&J\u0017\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0014H&¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/sku/SkuLogic;", "", "addCart", "", "addCartListener", "Lkotlin/Function4;", "", "", "Landroid/graphics/Rect;", "Landroid/graphics/Bitmap;", "allSelected", "", "bindData", "skuPanelData", "Lcom/ss/android/ugc/aweme/commerce/service/preview/SkuPanelData;", "buyNow", "purchaseListener", "Lkotlin/Function2;", "getProductCount", "traceSkuResult", "", "()[Ljava/lang/String;", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public interface a {
    @NotNull
    a a(@NotNull com.ss.android.ugc.aweme.commerce.service.i.a aVar);

    void a(@Nullable Function2<? super Integer, ? super String, Unit> function2);

    void a(@Nullable Function4<? super Integer, ? super String, ? super Rect, ? super Bitmap, Unit> function4);

    @Nullable
    String[] a();

    int b();
}
