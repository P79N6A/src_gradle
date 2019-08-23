package com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u001c\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J(\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/bubble/LiveCouponDataManager;", "", "()V", "COUPON_APPLY_INVALID", "", "COUPON_APPLY_OVER", "COUPON_APPLY_OVER_LIMIT", "shopCouponMap", "", "", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/ShopCouponResponse;", "clearCache", "", "requestApplyCoupon", "couponMetaId", "observer", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/RequestListener;", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/ConsumeCouponResponse;", "requestCouponList", "promotionId", "productId", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37835a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, com.ss.android.ugc.aweme.commerce.service.g.a.b> f37836b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final a f37837c = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/ConsumeCouponResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.a$a  reason: collision with other inner class name */
    static final class C0490a<TTaskResult, TContinuationResult> implements g<com.ss.android.ugc.aweme.commerce.service.g.a.a, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37838a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f37839b;

        C0490a(d dVar) {
            this.f37839b = dVar;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f37838a, false, 29303, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f37838a, false, 29303, new Class[]{i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
            if (iVar.d() || iVar.e() == null) {
                this.f37839b.b(iVar.e());
            } else {
                d dVar = this.f37839b;
                Object e2 = iVar.e();
                Intrinsics.checkExpressionValueIsNotNull(e2, "task.result");
                dVar.a(e2);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/ShopCouponResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class b<TTaskResult, TContinuationResult> implements g<com.ss.android.ugc.aweme.commerce.service.g.a.b, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37840a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37841b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f37842c;

        b(String str, d dVar) {
            this.f37841b = str;
            this.f37842c = dVar;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f37840a, false, 29304, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f37840a, false, 29304, new Class[]{i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
            if (iVar.d() || iVar.e() == null || ((com.ss.android.ugc.aweme.commerce.service.g.a.b) iVar.e()).statusCode != 0) {
                this.f37842c.b(iVar.e());
            } else {
                a aVar = a.f37837c;
                Map<String, com.ss.android.ugc.aweme.commerce.service.g.a.b> map = a.f37836b;
                String str = this.f37841b;
                Object e2 = iVar.e();
                Intrinsics.checkExpressionValueIsNotNull(e2, "task.result");
                map.put(str, e2);
                d dVar = this.f37842c;
                Object e3 = iVar.e();
                Intrinsics.checkExpressionValueIsNotNull(e3, "task.result");
                dVar.a(e3);
            }
            return null;
        }
    }

    private a() {
    }

    public final void a(@Nullable String str, @Nullable String str2, @NotNull d<com.ss.android.ugc.aweme.commerce.service.g.a.b> dVar) {
        i<com.ss.android.ugc.aweme.commerce.service.g.a.b> iVar;
        String str3 = str;
        String str4 = str2;
        d<com.ss.android.ugc.aweme.commerce.service.g.a.b> dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, dVar2}, this, f37835a, false, 29300, new Class[]{String.class, String.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, dVar2}, this, f37835a, false, 29300, new Class[]{String.class, String.class, d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "observer");
        com.ss.android.ugc.aweme.commerce.service.g.a.b bVar = f37836b.get(str3);
        if (bVar != null) {
            dVar2.a(bVar);
            return;
        }
        if (!(str3 == null || str4 == null)) {
            if (PatchProxy.isSupport(new Object[]{str3, str4}, null, com.ss.android.ugc.aweme.commerce.sdk.goods.api.b.f37736a, true, 29262, new Class[]{String.class, String.class}, i.class)) {
                iVar = (i) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, com.ss.android.ugc.aweme.commerce.sdk.goods.api.b.f37736a, true, 29262, new Class[]{String.class, String.class}, i.class);
            } else {
                Intrinsics.checkParameterIsNotNull(str3, "promotionId");
                Intrinsics.checkParameterIsNotNull(str4, "productId");
                iVar = com.ss.android.ugc.aweme.commerce.sdk.goods.api.b.f37737b.getShopCoupon(str3, str4);
            }
            iVar.a((g<TResult, TContinuationResult>) new b<TResult,TContinuationResult>(str4, dVar2), i.f1052b);
        }
    }
}
