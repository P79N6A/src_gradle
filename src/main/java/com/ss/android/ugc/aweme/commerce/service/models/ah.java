package com.ss.android.ugc.aweme.commerce.service.models;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.models.v;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"transShopRecommend2DetailPromotion", "Lcom/ss/android/ugc/aweme/commerce/service/models/SimpleDetailPromotion;", "good", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopRecommend$RecommendPromotion;", "commerce.service_release"}, k = 2, mv = {1, 1, 15})
public final class ah {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38173a;

    @NotNull
    public static final w a(@Nullable v.a aVar) {
        v.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f38173a, true, 29909, new Class[]{v.a.class}, w.class)) {
            return (w) PatchProxy.accessDispatch(new Object[]{aVar2}, null, f38173a, true, 29909, new Class[]{v.a.class}, w.class);
        }
        w wVar = new w();
        if (aVar2 != null) {
            if (aVar2.f38240e != null) {
                wVar.setElasticImages(CollectionsKt.listOf(aVar2.f38240e));
            }
            wVar.setTitle(aVar2.f38236a);
            wVar.setPrice(aVar2.f38237b);
            wVar.setStatus(2);
            wVar.setPromotionId(aVar2.f38238c);
            wVar.setProductId(aVar2.f38239d);
        }
        return wVar;
    }
}
