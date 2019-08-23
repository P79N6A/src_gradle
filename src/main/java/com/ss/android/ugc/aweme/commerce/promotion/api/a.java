package com.ss.android.ugc.aweme.commerce.promotion.api;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.dr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/promotion/api/PromotionApiImpl;", "", "()V", "API_URL_PREFIX_SI", "", "portfolioApi", "Lcom/ss/android/ugc/aweme/commerce/promotion/api/PromotionApi;", "getPromotionsV2ByProductDimention", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/promotion/api/vo/PromotionsResponse;", "promotionId", "productId", "authorId", "getPromotionsV2ByVideoDimension", "awemeId", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37684a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f37685b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final PromotionApi f37686c;

    private a() {
    }

    static {
        Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com/").create(PromotionApi.class);
        Intrinsics.checkExpressionValueIsNotNull(create, "ServiceManager.get().get…PromotionApi::class.java)");
        f37686c = (PromotionApi) create;
    }

    @NotNull
    public final i<com.ss.android.ugc.aweme.commerce.promotion.api.a.a> a(@Nullable String str, @NotNull String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f37684a, false, 29242, new Class[]{String.class, String.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f37684a, false, 29242, new Class[]{String.class, String.class}, i.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "authorId");
        return f37686c.getPromotionsV2(null, null, str, str2, dr.a().a(str2));
    }

    @NotNull
    public final i<com.ss.android.ugc.aweme.commerce.promotion.api.a.a> a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f37684a, false, 29243, new Class[]{String.class, String.class, String.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f37684a, false, 29243, new Class[]{String.class, String.class, String.class}, i.class);
        }
        Intrinsics.checkParameterIsNotNull(str4, "promotionId");
        Intrinsics.checkParameterIsNotNull(str5, "productId");
        Intrinsics.checkParameterIsNotNull(str6, "authorId");
        return f37686c.getPromotionsV2(str, str2, null, str3, dr.a().a(str6));
    }
}
